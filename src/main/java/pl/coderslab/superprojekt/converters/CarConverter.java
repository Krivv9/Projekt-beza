package pl.coderslab.superprojekt.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.superprojekt.models.Car;
import pl.coderslab.superprojekt.repositories.CarRepository;

public class CarConverter implements Converter<String, Car> {
    @Autowired
    private CarRepository carRepository;
    @Override
    public Car convert(String source) {
        Long id = Long.parseLong(source);
        return carRepository.findCarById(id);
    }
}
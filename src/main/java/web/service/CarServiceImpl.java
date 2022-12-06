package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    public List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Bmw", 1, "diesel"));
        carsList.add(new Car("Audi", 2, "gasoline"));
        carsList.add(new Car("Lexus", 3, "gas"));
        carsList.add(new Car("Tesla", 4, "electric"));
        carsList.add(new Car("Toyota", 5, "hybrid"));
    }

    @Override
    public List<Car> carCount(int num) {
        if (num == 0 && num >= 5) {
            return carsList;
        }
        return carsList.stream().limit(num).collect(Collectors.toList());
    }




}

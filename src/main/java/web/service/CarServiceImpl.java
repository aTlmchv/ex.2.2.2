package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> carCount(List<Car> carsList, int num) {
        if (num == 0 && num >= 5) {
            return carsList;
        }
        return carsList.stream().limit(num).collect(Collectors.toList());
    }
}

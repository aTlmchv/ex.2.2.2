package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    private CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Bmw", 1, "diesel"));
        carsList.add(new Car("Audi", 2, "gasoline"));
        carsList.add(new Car("Lexus", 3, "gas"));
        carsList.add(new Car("Tesla", 4, "electric"));
        carsList.add(new Car("Toyota", 5, "hybrid"));
        carsList = carService.carCount(carsList, allCars);
        model.addAttribute("carsList", carsList);
        return "cars";
    }
}
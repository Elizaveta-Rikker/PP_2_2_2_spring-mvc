package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car (9, "red", "Bugi"));
        cars.add(new Car (99, "blue", "Vugi"));
        cars.add(new Car (999, "green", "Fugi"));
        cars.add(new Car (9999, "yellow", "Gugi"));
        cars.add(new Car (9999, "purple", "Zugi"));
        cars = CarService.pickCars(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}

package web.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarService {
    private static List<Car> cars = new ArrayList<>();

    static{
        cars.add(new Car (9, "red", "Bugi"));
        cars.add(new Car (99, "blue", "Vugi"));
        cars.add(new Car (999, "green", "Fugi"));
        cars.add(new Car (9999, "yellow", "Gugi"));
        cars.add(new Car (9999, "purple", "Zugi"));
    }
    public List<Car> getCarsList(int count) {
        if (count == 0 || count > 5) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

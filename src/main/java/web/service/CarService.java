package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    public List<Car> getCarsByCount(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 1, "red"));
        cars.add(new Car("BMW", 2, "black"));
        cars.add(new Car("Mercedes", 3, "white"));
        cars.add(new Car("VW", 4, "blue"));
        cars.add(new Car("Skoda", 5, "green"));
        if (count == null || count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}

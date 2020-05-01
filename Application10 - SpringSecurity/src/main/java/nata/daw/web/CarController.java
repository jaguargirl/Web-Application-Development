package nata.daw.web;

import nata.daw.domain.Car;
import nata.daw.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    private CarRepository repository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars() {
        // De implementat
        return null;
    }
}

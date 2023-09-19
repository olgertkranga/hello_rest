package net.codejava;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class CarController {
 
    @Autowired
    private CarService carService;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/cars")
    public List<Cars> list() {
        return carService.listAll();
    }
    
    @GetMapping("/cars/{id}")
    public ResponseEntity<Cars> get(@PathVariable Integer id) {
        try {
            Cars car = carService.get(id);
            return new ResponseEntity<Cars>(car, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Cars>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Create operation
    @PostMapping("/cars")
    public void add(@RequestBody Cars cars) {
        carService.save(cars);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/cars/{id}")
    public ResponseEntity<?> update(@RequestBody Cars car, @PathVariable Integer id) {
        try {
            Cars existCar = carService.get(id);
            carService.save(car);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Delete operation
    @DeleteMapping("/cars/{id}")
    public void delete(@PathVariable Integer id) {
        carService.delete(id);
    }
}
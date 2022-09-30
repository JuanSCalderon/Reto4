/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repository;

import com.example.demo.Interface.CarInterface;
import com.example.demo.Model.Car;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juancalderon
 */
@Repository

public class CarRepository {

    @Autowired
    private CarInterface carCrudRepository;

    public List<Car> getAll() {
        return (List<Car>) carCrudRepository.findAll();
    }

    public Optional<Car> getCar(int id) {
        return carCrudRepository.findById(id);
    }

    public Car save(Car car) {
        return carCrudRepository.save(car);
    }
    
    public void delete(Car car){
        carCrudRepository.delete(car);
    }
}

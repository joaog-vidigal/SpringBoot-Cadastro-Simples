package com.example.Fridge.controller;

import com.example.Fridge.model.FoodModel;
import com.example.Fridge.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")

@RequiredArgsConstructor

public class FoodController {

    //Dependency Injection
    private final FoodService service;


    @GetMapping
    public List<FoodModel> getAll() {
        return service.getAll();
    }

    @PostMapping
    public FoodModel post(@RequestBody FoodModel food) {
        return service.save(food);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}

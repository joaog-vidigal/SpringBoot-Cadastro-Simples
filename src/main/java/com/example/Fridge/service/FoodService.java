package com.example.Fridge.service;

import com.example.Fridge.model.FoodModel;
import com.example.Fridge.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository repository;

    //LIST
    public List<FoodModel> getAll() {
        return repository.findAll();
    }

    //CREATE
    public FoodModel save(FoodModel food) {
        return repository.save(food);
    }

    //CREATE
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

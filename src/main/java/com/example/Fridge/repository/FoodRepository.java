package com.example.Fridge.repository;

import com.example.Fridge.model.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodModel, Long> {

}

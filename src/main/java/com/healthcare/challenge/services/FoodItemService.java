package com.healthcare.challenge.services;

import com.healthcare.challenge.models.FoodItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {

    @Value("${fatsecret.api.url}")
    private String foodItemAPI;

    public FoodItem searchFoodItemById(final long id ){
        return new FoodItem();
    }

    public FoodItem searchFoodItemByName(final String name){
        return new FoodItem();
    }
}

package com.healthcare.challenge.services;

import com.fatsecret.platform.model.Food;
import com.fatsecret.platform.services.FatsecretService;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {

   final private FatsecretService fatsecretService;

    public FoodItemService(final FatsecretService fatSecretService) {
        this.fatsecretService = fatSecretService;
    }

    public Food searchFoodItemById(final long id) {
        return fatsecretService.getFood(id);
    }

    //TODO: implement search by name
    public Food searchFoodItemByName(final String name) {
        return new Food();
    }
}

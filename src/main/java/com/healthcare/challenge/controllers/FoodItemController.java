package com.healthcare.challenge.controllers;

import com.fatsecret.platform.model.Food;
import com.healthcare.challenge.services.FoodItemService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodItemController {
    private static final Logger LOGGER = LogManager.getLogger();
    private final FoodItemService foodItemService;

    public FoodItemController(final FoodItemService foodItemService) {
        this.foodItemService = foodItemService;
    }

    @GetMapping(value = "/foodItem/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Food searchItem(@PathVariable("id") final long id) {
        return this.foodItemService.searchFoodItemById(id);
    }
}

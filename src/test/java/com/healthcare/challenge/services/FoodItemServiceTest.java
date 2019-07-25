package com.healthcare.challenge.services;

import com.fatsecret.platform.model.Food;
import com.fatsecret.platform.services.FatsecretService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FoodItemServiceTest {

@Mock
FatsecretService fatsecretService;

@InjectMocks
private FoodItemService foodItemService;

    @Test
    public void searchFoodItemById() {
        final Food expectedFood = new Food();
        expectedFood.setId(65l);
        expectedFood.setDescription("Expected food item");
        expectedFood.setName("Tamale");
        when(fatsecretService.getFood(anyLong())).thenReturn(expectedFood);

        final Food actualFood  = foodItemService.searchFoodItemById(2L);
        assertThat(actualFood, is(expectedFood));
    }
}
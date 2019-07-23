package com.healthcare.challenge.config;

import com.fatsecret.platform.services.FatsecretService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FatSecretConfig {

    @Value("${fatsecret.api.key}")
    private String foodItemAPIKey;

    @Value("${fatsecret.api.secret}")
    private String foodItemAPISecret;

    @Bean
    public FatsecretService fatsecretService(){
        return  new FatsecretService(foodItemAPIKey, foodItemAPISecret);
    }
}

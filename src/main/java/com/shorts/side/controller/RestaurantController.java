package com.shorts.side.controller;

import com.shorts.side.dto.RestaurantDto;
import com.shorts.side.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping("/restaurant")
    public List<RestaurantDto> readAllPlaces() {
        return restaurantService.getRestaurant();
    }

}

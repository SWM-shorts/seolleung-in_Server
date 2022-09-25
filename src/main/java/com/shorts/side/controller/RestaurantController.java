package com.shorts.side.controller;

import ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import com.shorts.side.dto.RestaurantDto;
import com.shorts.side.dto.RestaurantResponseDto;
import com.shorts.side.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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


    @GetMapping("/getRestaurantDate")
    public List<RestaurantResponseDto> getRestaurantDate(@RequestParam int day) {
        List<RestaurantResponseDto> list = new ArrayList<>();
//        return restaurantService.getRestaurantDate(date);
        List<RestaurantDto> restaurant = restaurantService.getRestaurant();
        for(RestaurantDto res : restaurant) {
            RestaurantResponseDto rrd = new RestaurantResponseDto(res, day);
            list.add(rrd);
        }

        return list;
    }

    @GetMapping("/restaurant/random")
    public RestaurantDto readPlaces() {
        return restaurantService.getRandomRestaurant();
    }

}

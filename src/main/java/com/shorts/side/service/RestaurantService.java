package com.shorts.side.service;

import com.shorts.side.dto.RestaurantDto;
import com.shorts.side.repository.RestaurantRepository;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public List<RestaurantDto> getRestaurant() {
        return restaurantRepository.getRestaurant();
    }
    public RestaurantDto getRandomRestaurant() {
        return restaurantRepository.getRandomRestaurant();
    }
}

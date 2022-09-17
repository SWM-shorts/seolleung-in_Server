package com.shorts.side.repository;

import org.springframework.stereotype.Repository;

import com.shorts.side.domain.Restaurant;
import com.shorts.side.dto.RestaurantDto;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Repository
@RequiredArgsConstructor
public class RestaurantRepository {

    private final EntityManager em;
    public List<RestaurantDto> getRestaurant() {

        List<RestaurantDto> result = new ArrayList<>();

        List<Restaurant> restaurants =
                em.createQuery("SELECT a FROM Restaurant a", Restaurant.class).getResultList();

        restaurants.forEach(restaurant -> {
            try {
                result.add(new RestaurantDto(restaurant));
            } catch (NullPointerException e) {
                return;
            }
        });

        return result;
    }
    public RestaurantDto getRandomRestaurant() {

//        AtomicReference<RestaurantDto> result = new AtomicReference<>(new RestaurantDto());

        RestaurantDto result;
        List<Restaurant> restaurants =
                em.createQuery("SELECT a FROM Restaurant a", Restaurant.class).getResultList();
        System.out.println(restaurants.size());
//        restaurants.forEach(restaurant -> {
//            try {
//                result.set(new RestaurantDto(restaurant));
//            } catch (NullPointerException e) {
//                return;
//            }
//        });
        double dValue = Math.random();
        int iValue = (int)(dValue * restaurants.size());
        result = new RestaurantDto(restaurants.get(iValue));

        return result;
    }
}
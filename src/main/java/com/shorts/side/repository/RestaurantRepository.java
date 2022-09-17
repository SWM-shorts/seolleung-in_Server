package com.shorts.side.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shorts.side.domain.Restaurant;
import com.shorts.side.dto.RestaurantDto;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

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
}
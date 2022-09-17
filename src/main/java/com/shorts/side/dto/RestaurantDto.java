package com.shorts.side.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import com.shorts.side.domain.Restaurant;


@Getter
@RequiredArgsConstructor
public class RestaurantDto {
    private String name;
    private String resclass;
    private String signatureMenu;
    private String address;
    private String businessHour;
    private String price;
    private String menuLink;
    private String mapLink;
    private int mentorClass;
    public RestaurantDto(Restaurant restaurant) {
        name=restaurant.getName();
        resclass=restaurant.getResclass();
        signatureMenu=restaurant.getSignatureMenu();
        address=restaurant.getAddress();
        businessHour=restaurant.getBusinessHour();
        price=restaurant.getPrice();
        menuLink=restaurant.getMenuLink();
        mapLink=restaurant.getMapLink();
        mentorClass=restaurant.getMentorClass();
    }
}

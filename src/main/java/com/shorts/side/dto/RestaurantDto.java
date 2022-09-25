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
    private String MON_business_hour;
    private String MON_break_hour;
    private String TUE_business_hour;
    private String TUE_break_hour;
    private String WED_business_hour;
    private String WED_break_hour;
    private String THU_business_hour;
    private String THU_break_hour;
    private String FRI_business_hour;
    private String FRI_break_hour;
    private String SAT_business_hour;
    private String SAT_break_hour;
    private String SUN_business_hour;
    private String SUN_break_hour;

    private String business_Hour;
    private String break_Hour;

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
        MON_business_hour=restaurant.getMON_business_hour();
        MON_break_hour=restaurant.getMON_break_hour();
        TUE_business_hour=restaurant.getTUE_business_hour();
        TUE_break_hour=restaurant.getTUE_break_hour();
        WED_business_hour=restaurant.getWED_business_hour();
        WED_break_hour=restaurant.getWED_break_hour();
        THU_business_hour=restaurant.getTHU_business_hour();
        THU_break_hour=restaurant.getTHU_break_hour();
        FRI_business_hour=restaurant.getFRI_business_hour();
        FRI_break_hour=restaurant.getFRI_break_hour();
        SAT_business_hour=restaurant.getSAT_business_hour();
        SAT_break_hour=restaurant.getSAT_break_hour();
        SUN_business_hour=restaurant.getSUN_business_hour();
        SUN_break_hour=restaurant.getSUN_break_hour();
    }
}

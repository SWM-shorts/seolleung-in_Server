package com.shorts.side.dto;

import com.shorts.side.domain.Restaurant;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RestaurantResponseDto {
    private String name;
    private String resclass;
    private String signatureMenu;
    private String address;
    private String businessHour;
    private String price;
    private String menuLink;
    private String mapLink;
    private int mentorClass;
    private String business_Hour;
    private String break_Hour;

    public RestaurantResponseDto(RestaurantDto restaurant,int day) {
        //week : 0 일, 월, 화, 수, 목, 금, 토

        name=restaurant.getName();
        resclass=restaurant.getResclass();
        signatureMenu=restaurant.getSignatureMenu();
        address=restaurant.getAddress();
        businessHour=restaurant.getBusinessHour();
        price=restaurant.getPrice();
        menuLink=restaurant.getMenuLink();
        mapLink=restaurant.getMapLink();
        mentorClass=restaurant.getMentorClass();
        switch(day) {
            case 0: //일
                business_Hour=restaurant.getSUN_business_hour();
                break_Hour=restaurant.getSUN_break_hour();
                break;
            case 1: //월
                business_Hour=restaurant.getMON_business_hour();
                break_Hour=restaurant.getMON_break_hour();
                break;
            case 2: //화
                business_Hour=restaurant.getTUE_business_hour();
                break_Hour=restaurant.getTUE_break_hour();
                break;
            case 3: //수
                business_Hour=restaurant.getWED_business_hour();
                break_Hour=restaurant.getWED_break_hour();
                break;
            case 4: //목
                business_Hour=restaurant.getTHU_business_hour();
                break_Hour=restaurant.getTHU_break_hour();
                break;
            case 5: //금
                business_Hour=restaurant.getFRI_business_hour();
                break_Hour=restaurant.getFRI_break_hour();
                break;
            case 6: //토
                business_Hour=restaurant.getSAT_business_hour();
                break_Hour=restaurant.getSAT_break_hour();
                break;
        }
    }
}

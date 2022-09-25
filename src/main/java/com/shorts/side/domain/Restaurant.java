package com.shorts.side.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "SEOLLEUNG_Restaurant")
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @Column(name="name")
    private String name;

    @Column(name="resclass")
    private String resclass;

    @Column(name="signature_menu")
    private String signatureMenu;

    @Column(name="address")
    private String address;

    @Column(name="business_hour")
    private String businessHour;

    @Column(name="price")
    private String price;

    @Column(name="menu_link")
    private String menuLink;

    @Column(name="map_link")
    private String mapLink;

    @Column(name="mentor_class")
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

}

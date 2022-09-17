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


}

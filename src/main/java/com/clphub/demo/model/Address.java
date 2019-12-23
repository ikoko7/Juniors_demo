package com.clphub.demo.model;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;
    private String streetName;
    private String zipCode;
    private String ubani;
    private Long userID;


    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getUbani() {
        return ubani;
    }

    public void setUbani(String ubani) {
        this.ubani = ubani;
    }
}

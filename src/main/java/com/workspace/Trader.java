package com.workspace;

public class Trader {

    private final String fullName;
    private final String city;

    public String getCountry() {
        return country;
    }

    private String country;

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }
}
package com.workspace;

public class Trader {

    private final String fullName;
    private final String city;
    private final String country;

    public String getCountry() {
        return country;
    }

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
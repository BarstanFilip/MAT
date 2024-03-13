package com.example.lab56ex3;

public class Model {
    String name, number, address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Model(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public Character getProfileLetter() {
        return name.charAt(0);
    }
}

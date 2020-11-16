package com.internship.singleResponsibilityPrinciple;

public class Car {
    private String name;
    private String manufacturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // избыточный метод подсчета машин в гараже
    public int calcCarsInGarage(Car[] mas){
        return mas.length;
    }
}

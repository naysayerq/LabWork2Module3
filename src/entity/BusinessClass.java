/*
 *
 * Classname BusinessClass
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package entity;

import interfaces.ICosting;

public class BusinessClass implements ICosting {


    // parameters for BusinessClass Class

    private String name;                    // name of flight
    private double pricePerKilometer;       // price for one kilometer
    private double distance;                // number of kilometers
    private double businessClassMultiplier; // multiplier for business-class tickets


    // empty constructor

    public BusinessClass() {
    }


    // full constructor

    public BusinessClass(String name, double pricePerKilometer, double distance, double businessClassMultiplier) {
        this.name = name;
        this.pricePerKilometer = pricePerKilometer;
        this.distance = distance;
        this.businessClassMultiplier = businessClassMultiplier;
    }


    // getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerKilometer() {
        return pricePerKilometer;
    }

    public void setPricePerKilometer(double pricePerKilometer) {
        this.pricePerKilometer = pricePerKilometer;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getBusinessClassMultiplier() {
        return businessClassMultiplier;
    }

    public void setBusinessClassMultiplier(double businessClassMultiplier) {
        this.businessClassMultiplier = businessClassMultiplier;
    }


    // toString() method

    @Override
    public String toString() {
        return "BusinessClass { " +
                "name='" + name + '\'' +
                ", pricePerKilometer=" + pricePerKilometer +
                ", distance=" + distance +
                ", business-ClassMultiplier=" + businessClassMultiplier +
                " }";
    }


    // getCost() method for interface

    @Override
    public int getCost() {
        return (int) (this.getPricePerKilometer() * this.getDistance() * this.getBusinessClassMultiplier());
    }

}

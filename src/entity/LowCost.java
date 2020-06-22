/*
 *
 * Classname LowCost
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package entity;

import interfaces.ICosting;

public class LowCost implements ICosting {


    // parameters for LowCost class

    private String name;              // name of flight
    private double pricePerKilometer; // price for one kilometer
    private double distance;          // number of kilometers


    // empty constructor

    public LowCost() {
    }


    // full constructor

    public LowCost(String name, double pricePerKilometer, double distance) {
        this.name = name;
        this.pricePerKilometer = pricePerKilometer;
        this.distance = distance;
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


    // toString() method

    @Override
    public String toString() {
        return "Low-Cost { " +
                "name='" + name + '\'' +
                ", pricePerKilometer=" + pricePerKilometer +
                ", distance=" + distance +
                " }";
    }


    // getCost() method for interface

    @Override
    public int getCost() {
        return (int) (this.getPricePerKilometer() * this.getDistance());
    }

}

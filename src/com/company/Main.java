/*
 *
 * Classname Main
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *
 *   Module 3 LabWork 2
 *
 *  Laboratory work. (6 points)
 *
 *  Topic: Object-oriented programming,  JavaCollectionFramework
 *
 *  Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
 *
 *  Six methods must be written like in the following example. A point for each one.
 *
 *  Creative approaches are welcome.
 *
 *   Air fly: low-cost and business-class.
 *
 */

package com.company;

import entity.BusinessClass;
import entity.LowCost;
import interfaces.ICosting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // 1. Create two appropriate classes and 5 objects of each one.

        // Creating 5 objects of LowCost Class

        LowCost lowCostTicket1 = new LowCost("Lviv-Bratislava", 7, 470);
        LowCost lowCostTicket2 = new LowCost("Kyiv-Warsaw", 6, 787);
        LowCost lowCostTicket3 = new LowCost("Charkiv-Kyiv", 4, 479);
        LowCost lowCostTicket4 = new LowCost("Paris-Kyiv", 8.5, 2376.3);
        LowCost lowCostTicket5 = new LowCost("NewYork-Prague", 10, 4071.5);


        // Creating 5 objects of BusinessClass Class

        BusinessClass businessClassTicket1 = new BusinessClass("Kherson-Rome", 25, 2602, 1.5);
        BusinessClass businessClassTicket2 = new BusinessClass("Dnipro-Berlin", 23, 1835.2, 1.3);
        BusinessClass businessClassTicket3 = new BusinessClass("Istanbul-Kyiv", 31, 1293, 1.6);
        BusinessClass businessClassTicket4 = new BusinessClass("Tbilisi-Barcelona", 32, 4503, 1.4);
        BusinessClass businessClassTicket5 = new BusinessClass("Veins-Rome", 37, 1131.4, 2.1);


        // Creating ArrayList and adding both types of tickets

        List<ICosting> tickets = new ArrayList<>();
        tickets.add(lowCostTicket1);
        tickets.add(lowCostTicket2);
        tickets.add(lowCostTicket3);
        tickets.add(lowCostTicket4);
        tickets.add(lowCostTicket5);
        tickets.add(businessClassTicket1);
        tickets.add(businessClassTicket2);
        tickets.add(businessClassTicket3);
        tickets.add(businessClassTicket4);
        tickets.add(businessClassTicket5);


        // 2. Calculate the total price  of all tickets

        int totalTicketsPrice = tickets.stream().mapToInt(ICosting::getCost).sum();
        System.out.println("Total sum of all tickets prices: " + totalTicketsPrice + " ₴");


        // 3. Find the ticket with highest price

        ICosting ticketWithHighestPrice = tickets.stream().max(Comparator.comparingInt(ICosting::getCost)).orElse(null);
        System.out.println("Ticket with highest price: " + ticketWithHighestPrice);


        // 4. Find the ticket with lowest price

        ICosting ticketWithLowestPrice = tickets.stream().min(Comparator.comparingInt(ICosting::getCost)).orElse(null);
        System.out.println("Ticket with lowest price: " + ticketWithLowestPrice);


        // 5. Find the average price of tickets

        double averageTicketsPrice = tickets.stream().mapToInt(ICosting::getCost).average().orElse(0);
        System.out.println("Average tickets price: " + averageTicketsPrice + " ₴");


        // 6. Which tickets are more expensive, business-class or low-cost?

        double lowCostPrice = tickets.stream().filter(el -> el instanceof LowCost).mapToInt(ICosting::getCost).sum();
        double businessClassPrice = tickets.stream().filter(el -> el instanceof BusinessClass).mapToInt(ICosting::getCost).sum();

        // if-else condition for checking whats more expensive

        if (businessClassPrice > lowCostPrice){
            System.out.println("Business-class prices are higher!");
        } else if (lowCostPrice > businessClassPrice){
            System.out.println("Low-cost prices are higher!");
        } else {
            System.out.println("Prices are the same!");
        }



        /* ------------------------OUTCOME------------------------

            Total sum of all tickets prices: 577063 ₴

            Ticket with highest price: BusinessClass { name='Tbilisi-Barcelona',
            pricePerKilometer=32.0, distance=4503.0, business-ClassMultiplier=1.4 }

            Ticket with lowest price: Low-Cost { name='Charkiv-Kyiv',
            pricePerKilometer=4.0, distance=479.0 }

            Average tickets price: 57706.3 ₴

            Business-class prices are higher!

           ------------------------OUTCOME------------------------*/



    }
}

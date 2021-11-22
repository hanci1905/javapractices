package com.company.javapractices;

import java.util.Scanner;

public class planeTicketPrices {
    public static void main(String[] args) {
        int age, km, type;
        double price = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("type of the flight  if one way press 1  if turn-return press 2");
        type = input.nextInt();
        System.out.println("km of flight");

        km = input.nextInt();
        if(km<0)
            System.out.println("HATALI VERI GIRDINIZ");
        System.out.println("what is your age");
        age = input.nextInt();
        price = km * 0.10;
        if (age < 12) {
            price = 0.5 * price;
            if (type == 2) {
                price = 0.8 * price;
            }
        } else if (age >= 12 && age < 24) {
            price = 0.9 * price;
            if (type == 2) {
                price = 0.8 * price;
            }
        } else if (age > 65) {
            price = 0.7 * price;
            if (type == 2) {
                price = 0.8 * price;
            }
        } else {
            if (type == 2) {
                price = 0.8 * price;
            }
        }
        System.out.println("final price is " + price);
    }

}

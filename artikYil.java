package com.company.javapractices;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, sol;
        System.out.println("which year is it?");
        year = input.nextInt();
        sol = year % 4;
        if (sol == 0) {
            if (year % 400 == 0) {


                System.out.println("Artik yil");
            } else
                System.out.println("artik yil degil");

        } else {
            System.out.println("artik yil degil");
        }
    }
}

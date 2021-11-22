package com.company.javapractices;

import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, zodiac;
        System.out.println("which year do you born?");
        year = input.nextInt();
        zodiac = year % 12;
        switch (zodiac) {
            case 0:
                System.out.println("MONKEY");
                break;
            case 1:
                System.out.println("BLOSSOM");
                break;
            case 2:
                System.out.println("DOG");
                break;
            case 3:
                System.out.println("PIG");
                break;
            case 4:
                System.out.println("RAT");
                break;
            case 5:
                System.out.println("OX");
                break;
            case 6:
                System.out.println("TIGER");
                break;
            case 7:
                System.out.println("RABBIT");
                break;
            case 9:
                System.out.println("DRAGON");
                break;
            case 10:
                System.out.println("SNAKE");
                break;
            case 11:
                System.out.println("HORSE");
                break;
            case 12:
                System.out.println("SHEEP");
                break;

        }

    }
}

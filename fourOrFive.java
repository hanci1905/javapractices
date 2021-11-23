package com.company.javapractices;

import java.util.Scanner;

public class fourOrFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num");
        int a;
        a = input.nextInt();
        for (int i = 1; i < a; i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.println("can be divide 4 or 5 " + i);

            }
        }


    }
}


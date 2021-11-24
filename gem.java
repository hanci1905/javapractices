package com.company.javapractices;

import java.util.Scanner;

public class gem {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("enter a num :");
        int n = klavye.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int k = 0; k <= n - 1; k++) {

            for (int j = 1; j <= ( k + 1); j++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= 2 * (n - k) - 1; i++)
                System.out.print("*");

            System.out.println("");

        }
    }

}


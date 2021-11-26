package com.company.javapractices;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first num");
        int n1 = input.nextInt();
        System.out.println("enter second num");
        int n2 = input.nextInt();
        int min = 0;
        int i = 1;
        int ebob = 1;
        if (n1 < n2) {
            min = n1;
        } else
            min = n2;
        while (i <= min) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob *= i;
            }
            i++;

        }
        int ekok=(n1*n2)/ebob;
        System.out.println("ebob is " + ebob + " and ekok is "  + ekok);

    }
}

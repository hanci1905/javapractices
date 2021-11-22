package com.company.javapractices;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num");
        int a, sum = 0;
        a = input.nextInt();
        for (int i = 0; i < a; i++) {
            if ((i % 3) == 0 && (i % 4) == 0) {
                sum = i + sum;
            }
        }
        System.out.println("sum is " + sum);
    }
}

package com.company.javapractices;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int a, flag, counter = 0;
        int sum = 0;
        a = input.nextInt();
        flag = a;
        while (flag > 0) {
            flag /= 10;
            counter++;
        }
        System.out.println("counter " + counter);

        for (int i = 1; i <= counter; i++) {
            sum += a % 10 ;
            a = a / 10;

        }
        System.out.println("sum " + sum);
    }
}

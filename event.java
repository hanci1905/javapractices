package com.company;

import java.util.Scanner;

public class event {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int degree;

        System.out.println("enter degree ");
        degree=input.nextInt();
        if (degree < 5 ) {
            System.out.println("kayak yapabilirsiniz ");
        }
        else if (degree < 15 && degree >= 5) {
            System.out.println("sinemaya gidebilirsiniz ");

        }
        else if (degree < 25 && degree >= 15) {
           System.out.println("piknige gidebilirsiniz ");
        }
        else if (degree > 25) {
          System.out.println("yuzmeye gidebilirsiniz ");

        }

    }
}

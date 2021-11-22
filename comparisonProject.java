
package com.company;
import java.util.Scanner;

public class comparisonProject {

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a");
        a=input.nextInt();
        System.out.println("enter b");
        b=input.nextInt();
        System.out.println("enter c");
        c=input.nextInt();
        if (a > c && b > c) {
            if (b > a) {
                System.out.println("c<a<b");
            } else if (a > b) {
                System.out.println("c<b<a");
            }
        }
        if (c > a && b > a) {
            if (c > b) {
                System.out.println("a<b<c");
            } else if (b > c) {
                System.out.println("a<c<b");
            }
        }
        if (c > b && a > b) {
            if (c > a) {
                System.out.println("b<a<c");
            } else if (a > c) {
                System.out.println("b<c<a");
            }
        }
    }
}

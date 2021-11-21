package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, turkish, music, physics, chemistry, sum = 0, i = 0;
        double average;
        System.out.println("enter math grade");
        math = input.nextInt();
        System.out.println("enter turkish grade");
        turkish = input.nextInt();
        System.out.println("enter music grade");
        music = input.nextInt();
        System.out.println("enter physics grade");
        physics = input.nextInt();
        System.out.println("enter chemistry grade");
        chemistry = input.nextInt();
        if (math < 100 && math > 0) {
            sum += math;
            i++;
        }
        if (turkish < 100 && turkish > 0) {
            sum += turkish;
            i++;
        }
        if (music < 100 && music > 0) {
            sum += music;
            i++;
        }
        if (physics < 100 && physics > 0) {
            sum += physics;
            i++;
        }
        if (chemistry < 100 && chemistry > 0) {
            sum += chemistry;
            i++;
        }
        average = (double) sum / i;
        System.out.println("average is " + average);
    }
}

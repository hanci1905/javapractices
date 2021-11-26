package com.company.javapractices;
import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);

        System.out.println("enter a num ");

        int a= input.nextInt();
        for(int i=a;i>0;i--){
            for(int j=(a-i);j>0;j--){
                System.out.print(" ");

            }
            for(int k=(2*i-1);k>0;k--){
                System.out.print("*");

            }
            System.out.println("");

    }
}}

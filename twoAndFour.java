package com.company.javapractices;
import java.util.Scanner;
public class twoAndFour {
    public static void main( String [] args) {
    Scanner input=new Scanner(System.in);
    int i=0,sum=0;
    while(i%2==0){
        System.out.println("enter a num");
        i=input.nextInt();
        if(i%2==0 && i%4==0){
        sum+=i;
        }
    }
    System.out.println("sum is " + sum);
}}

package com.company.javapractices;
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a num ");
        int a=input.nextInt();
        int sum=0;
        for(int i=1;i <a; i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if(sum==a){
            System.out.println(a + " is a perfect number.");
        }
        else
            System.out.println(a + " is not  a perfect number.");

    }
    }

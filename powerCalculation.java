package com.company.javapractices;
import java.util.Scanner;
public class powerCalculation {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b,result;
        System.out.println("enter first number");
        a=input.nextInt();
        System.out.println("enter first number");
        b=input.nextInt();
        result=a;
        for(int i=1;i<b;i++){
            result*=a;
        }
        System.out.println("result is " + result);

    }
}

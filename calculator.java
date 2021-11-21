package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2,select;
        double result;
        System.out.println("enter first num");
        n1=input.nextInt();
        System.out.println("enter second num");
        n2=input.nextInt();
        System.out.println("which type calculation");
        System.out.println("For sum enter 1 \t For product enter 2 \t For subtraction enter 3 \t For divide enter 4 \t");
        select=input.nextInt();
        switch (select){
            case 1:
                result=n1+n2;
                System.out.println("the answer is " + result);

                break;
            case  2:
                result=n1*n2;
                System.out.println("the answer is " + result);

                break;
            case 3:
                result=n1-n2;
                System.out.println("the answer is " + result);

                break;
            case 4:
                result=(double) n1/n2;
                System.out.println("the answer is " + result);

                break;
            default:
                System.out.println("wrong selection");
        }



    }
}

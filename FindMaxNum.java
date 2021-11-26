package com.company;
import java.util.Scanner;
public class FindMaxNum {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.println("hot many number you enter");
        int num= input.nextInt();
        int max=0,min=1000;
        for(int i=0;i<num;i++){
            System.out.println("enter a num");
            int a= input.nextInt();

            if(max<a){
                max=a;
            }
            if(min>a){
                min=a;
            }
        }
        System.out.println("max is" + max);
        System.out.println("min is" + min);


    }
}

package com.company.javapractices;
import java.util.Scanner;
public class combination {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        int n,r,c,fact1=1,fact2=1,fact3=1;
        System.out.println("enter n");
        n=input.nextInt();
        System.out.println("enter r");
        r=input.nextInt();
        for(int i=1;i<=n;i++){
            fact1*=i;
        }
        for(int i=1;i<=r;i++){
            fact2*=i;
        }
        for(int i=1;i<=(n-r);i++){
            fact3*=i;
        }
        c=fact1/(fact2*fact3);
        System.out.println("combination is" + c);
    }
}

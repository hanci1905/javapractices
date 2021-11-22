package com.company;

import java.util.Scanner;

public class password {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        String user, password, passwordOne,asd;
        System.out.println("kullanici adi");
        user = input.nextLine();
        System.out.println("password?");

        password = input.nextLine();
        if (user.equals("patika")) {
            System.out.println("username is correct, checking password");
            if (password.equals("123")) {
                System.out.println("logged in");
            } else {
                System.out.println("password is wrong, if you want to change password press 1");
                a = input.nextInt();


            }
            if (a == 1) {
                System.out.println("enter new password");
                asd=input.nextLine();
                passwordOne = input.nextLine();
                System.out.println("new password is taken");

                if (password.equals(passwordOne)) {
                    System.out.println("enter new password");
                    passwordOne = input.nextLine();

                } else {
                    System.out.println("password was created");
                }

            }
        }
    }
}

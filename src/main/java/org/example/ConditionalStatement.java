package org.example;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("Enter your age");

        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if (age < 18){
            System.out.println("You are less than 18 and you are a teenager");
        }
        if (age > 18 && age < 40){
            System.out.println("You are a young boy");
        }
        if (age > 40 && age < 50){
            System.out.println("You are not young nor old");
        }
        else {
            System.out.println("You old");
        }
    }
}

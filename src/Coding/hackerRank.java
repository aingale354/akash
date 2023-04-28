package Coding;

import java.util.Scanner;

public class hackerRank {
    //static int num=2;

    public static void main(String[] args) {
       // for (int i = 1; i <= 10; i++) ;
        System.out.println("Multiplication Table for" );
        for (int num = 1; num <= 10; num++) {
            System.out.println("Multiplication table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                System.out.println(num + " x " + i + " = " + result);
            }
            System.out.println(); // Add a blank line between each table
        }
    }
}

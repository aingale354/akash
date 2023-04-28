package Coding;

import java.util.Scanner;

public class NaturalNumber {

    public static void main(String[] args) {

        System.out.println("enter number ");
        int n;
        Scanner akash = new Scanner(System.in);
        n = akash.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i+ "number is even " );
            else {
                System.out.println(i +"number is odd" );
            }

        }
    }
}

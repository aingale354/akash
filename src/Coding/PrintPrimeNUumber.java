package Coding;

import java.util.Scanner;

public class PrintPrimeNUumber {
    public static void main(String[] args) {
        int i, n;
        System.out.println("enter n number");
        Scanner ak = new Scanner(System.in);
        n = ak.nextInt();
        for (i = 2; i <= n; i++)
         {
            if (i % n == 0) {
                System.out.println(i + "is not a prime number: ");
            } else {
                System.out.println(i + "is prime numbner");
            }

        }

    }
}
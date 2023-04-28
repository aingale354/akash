package Coding;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeDynamic {
    public static void main(String[] args) {
        int size, i;
        Scanner arr = new Scanner(System.in);
        System.out.println("enter array size");
        //   size = arr.nextInt();
        int ar[] = new int[5];
        for (i = 0; i < 5; i++) {
            ar[i] = arr.nextInt();
        }
        System.out.println("enter array element : ");
        for (i = 0; i < 5; i++) {
            System.out.println(ar[i] + " ");
        }
        System.out.println("size of array is: " + ar.length);//for count the length of array
        for (i = 5 - 1; i >= 0; i--) {
            System.out.println(ar[i] + " ");
        }
    }
}


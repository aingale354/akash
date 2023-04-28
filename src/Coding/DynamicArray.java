package Coding;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        int i, size;
        Scanner arr=new Scanner(System.in);
        System.out.println("enter array size: ");
       size= arr.nextInt();
       int ar[]=new int[size];
       for(i=0;i<size;i++){
           ar[i]= arr.nextInt();
       }
        System.out.println(" printed array element is");
        for(i=0;i<size;i++){
            System.out.println(ar[i]+ " ");
        }
    }
}

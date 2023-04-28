package Coding;

public class BubbleSort {
    void sorting(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-i;i++)
            for(int j=0;j<n-i+1;j++)
            if(arr[j] > arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+i];
                arr[j+i]=temp;
            }
    }
    void PrintingArray(int arr[])
    {
         int n=arr.length;
         for(int i=0;i<n;i++)
             System.out.println(arr[i]+ " ");
        System.out.println();
    }
}

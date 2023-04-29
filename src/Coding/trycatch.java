package Coding;public class trycatch {
    public static void main(String[] args) {

        try {
            int arr[]={12,45,41,56,55};
            for (int i=4;i< arr.length;i++)
            System.out.println(arr[4]);
        }
                catch(Exception e)
            {
                System.out.println("in this array only 5th element axes but you try more ");
            }
        finally {
            System.out.println("i am always here");
        }

        }

    }


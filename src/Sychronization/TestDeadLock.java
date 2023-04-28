package Sychronization;

public class TestDeadLock {
    public static void main(String[] args) {
          int num=2;
          //  for(int num=2;num<3;num++)
            {
           // System.out.println("================="+num+":");
                {
                    for (int i = 1; i <= 10; i++) {
                        int res = num * i;
                        System.out.println(num + "x" + i + ":" + res);

                    }
                }
            }
    }}



package Coding;

public class Constructor1 {
    void add()
    {
        int a=10,b=25,c;
        c=a+b;
        System.out.println(c);


    }
    void add(int d, double j )
    {
        double z=d-j;
        System.out.println(z);
    }
        public static void main(String[] args) {
            Constructor1 akash=new Constructor1();
            akash.add(35,20.25);
        }
    }



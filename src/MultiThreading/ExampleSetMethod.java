package MultiThreading;

public class ExampleSetMethod extends Thread{
    public void run()
    {
        System.out.println("inside the run method");
    }

    public static void main(String[] args) {
        ExampleThreading T1=new ExampleThreading();
        ExampleThreading T2=new ExampleThreading();
        ExampleThreading T3=new ExampleThreading();

        System.out.println("priority Thread 1: "+T1.getPriority());
        System.out.println("priority Thread 2: "+T2.getPriority());
        System.out.println("priority Thread 3: "+T3.getPriority());

        T1.setPriority(6);
        T2.setPriority(10);
        T3.setPriority(15);
        System.out.println("priority Thread 1: "+T1.getPriority());
        System.out.println("priority Thread 2: "+T2.getPriority());
        System.out.println("priority Thread 3: "+T3.getPriority());


    }
}

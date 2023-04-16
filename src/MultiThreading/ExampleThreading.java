package MultiThreading;

// create java threading example
public class ExampleThreading extends Thread{
    public void run()
    {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ExampleThreading t1=new ExampleThreading();
        t1.start();
    }
}

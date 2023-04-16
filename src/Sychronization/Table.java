package Synchronization;

public class Table {
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(i*n);
        }
    }
}

class MyThread1 extends Thread{
    Table t1;
    MyThread1(Table t1){
        this.t1=t1;
    }
    public void run(){
        t1.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t1;
    MyThread2(Table t1){
        this.t1=t1;
    }
    public void run(){
        t1.printTable(2);
    }
}

class MyThread3 {
    public static void main(String[] args) {
        Table table = new Table();
        MyThread1 thread1 = new MyThread1(table);
        MyThread2 thread2 = new MyThread2(table);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
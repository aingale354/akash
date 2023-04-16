
package Sychronization;

public class Customers {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("Withdraw");
        if (this.amount < amount) {
            System.out.println("Less balance, please wait for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            this.amount -= amount;
            System.out.println("Withdrawn amount: " + amount);
        }
    }

    synchronized void deposit(int amount) {
        System.out.println("Deposit");
        this.amount += amount;
        System.out.println("Deposited amount: " + amount);
        notify();
    }

    static class Test {
        public static void main(String[] args) {
            final Customers customer = new Customers();

            // Create a withdraw thread
            Thread withdrawThread = new Thread(() -> {
                synchronized (customer) {
                    customer.withdraw(30000);
                }
            });

            // Create a deposit thread
            Thread depositThread = new Thread(() -> {
                synchronized (customer) {
                    customer.deposit(40000);
                }
            });

            // Start both threads
            withdrawThread.start();
            depositThread.start();
        }
    }
}
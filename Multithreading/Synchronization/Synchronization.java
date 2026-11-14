// package Multithreading.Synchronization;

class MyData {
    synchronized public void display(String str) {
        // only one thread at a time -> critical section
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }

    }
}

class MyThread_1 extends Thread {
    MyData d;

    public MyThread_1(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("Hello, World! ");
    }
}

class MyThread_2 extends Thread {
    MyData d;

    public MyThread_2(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("Welcome.");
    }
}

public class Synchronization {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread_1 mt1 = new MyThread_1(d);
        MyThread_2 mt2 = new MyThread_2(d);

        mt1.start();
        // make sure first mt1 executed then mt2 for achiving first "Hello world" then
        // "Welcome"
        try {
            mt1.join();
        } catch (InterruptedException e) {
        }
        mt2.start();
    }
}

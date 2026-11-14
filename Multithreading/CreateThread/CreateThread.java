/*
    Thread and main class are different here
*/

// package Multithreading.CreateThread;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("MyThread HELLO " + i);
        }
    }
}

class Test implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Runnable Test " + i);
        }
    }
}

public class CreateThread {
    public static void main(String[] args) {
        // simply creating instance of thread and call
        MyThread th = new MyThread();
        th.start();

        // creating instance of Test
        Test t = new Test();
        // creating Thread with test object
        Thread th2 = new Thread(t);
        th2.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("Bye " + i);
        }
    }
}

// // Main Class it self is a thread

// public class CreateThread extends Thread {
// public void run() {
// for (int i = 0; i < 50; i++) {
// System.out.println("MyThread HELLO " + i);
// }
// }

// public static void main(String[] args) {
// CreateThread th = new CreateThread();
// th.start();

// for (int i = 0; i < 50; i++) {
// System.out.println("Bye " + i);
// }
// }
// }

// // Main Class it self is a Runnable Interface

// public class CreateThread implements Runnable {
// public void run() {
// for (int i = 0; i < 50; i++) {
// System.out.println("MyThread HELLO " + i);
// }
// }

// public static void main(String[] args) {
// CreateThread ct = new CreateThread();
// Thread th = new Thread(ct);
// th.start();

// for (int i = 0; i < 50; i++) {
// System.out.println("Bye " + i);
// }
// }
// }
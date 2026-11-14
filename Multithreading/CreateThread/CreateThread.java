
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
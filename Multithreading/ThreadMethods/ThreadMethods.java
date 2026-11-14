// package Multithreading.ThreadMethods;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);

            try {
                Thread.sleep(500); // this will delay the thread execution by 0.5 second
            } catch (InterruptedException e) {
                System.out.println("ERROR : " + e);
            }
        }
    }

}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Rakibul");
        System.out.println("Thread ID : " + mt.threadId());
        System.out.println("Thread NAME : " + mt.getName());
        System.out.println("Thread STATE : " + mt.getState());
        System.out.println("Thread PRIORITY : " + mt.getPriority());
        System.out.println("Thread ALIVE : " + mt.isAlive());
        mt.start();

    }
}

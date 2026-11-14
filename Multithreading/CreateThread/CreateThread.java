
class Test extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("HELLO " + i);
        }
    }
}

public class CreateThread {
    public static void main(String[] args) {
        Test th = new Test();
        th.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("Bye " + i);
        }
    }
}
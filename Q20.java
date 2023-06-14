class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Your Name");
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello Java");
    }
}

public class Q20 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable1());
        Thread thread2 = new Thread(new MyRunnable2());

        thread1.start();
        thread2.start();
    }
}

class ChildThread extends Thread {
    public void run() {
        System.out.println("Child Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class Q13 {
    public static void main(String[] args) {
        int numThreads = 5;

        for (int i = 0; i < numThreads; i++) {
            ChildThread thread = new ChildThread();
            thread.start();
        }
    }
}

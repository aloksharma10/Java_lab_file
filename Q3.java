public class Q3 {
    // Static variable
    private static int count = 0;

    // Static block
    static {
        System.out.println("Static block called.");
    }
    // Static method
    public static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Initial count value: " + count);

        // Calling static method
        incrementCount();
        System.out.println("Count after increment: " + count);

        incrementCount();
        System.out.println("Count after another increment: " + count);
    }
}

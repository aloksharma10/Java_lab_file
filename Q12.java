public class Q12 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = 10;
        try {
            int result = numbers[index];
            System.out.println("The value at index " + index + " is: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("Program continues after the exception handling.");
    }
}

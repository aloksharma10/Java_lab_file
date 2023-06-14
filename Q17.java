import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Select the operation:");
        System.out.println("0. To Exit");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (0-4): ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 0:
                System.out.println("Exit");
                System.exit(0);
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a number from 1 to 4.");
                System.exit(0);
        }

        System.out.println("Result: " + result);
    }
}

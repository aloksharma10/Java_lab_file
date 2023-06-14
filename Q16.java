import java.util.Scanner;

public class Q16 {
    private String name;
    private int age;
    private String address;

    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter address: ");
        address = scanner.nextLine();
    }

    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Q16 employee = new Q16();
        employee.getData();
        System.out.println();
        employee.showData();
    }
}

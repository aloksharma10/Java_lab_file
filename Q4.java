public class Q4 {
    private String name;
    private int age;

    public Q4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Q4 student = new Q4("Alok", 18);
        student.display();
    }
}

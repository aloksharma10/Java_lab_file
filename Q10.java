interface detail {
    String showDetail();
}
interface marks {
    int total_Marks();
}
class student implements detail,marks {
    private String name;
    private int num1;
    private int num2;
    public student(String name, int num1, int num2) {
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
    }
    public String showDetail() {
        System.out.println("Detail: ");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + "\t" + num1 + "\t" + num2);
        return null;
    }
    public int total_Marks() {
        System.out.println(num1+num2);
        return 0;
    }

}
public class Q10 {
    public static void main(String[] args) {
        student stu = new student("Himanshu",100,100);
        stu.showDetail();
        stu.total_Marks();
    }
}

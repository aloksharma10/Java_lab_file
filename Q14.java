import java.io.FileInputStream;

public class Q14 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("File/input.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

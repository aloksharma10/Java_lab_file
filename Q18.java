import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            System.out.println("Enter lines (type 'STOP' to quit):");
            while (!(line = br.readLine()).equals("STOP")) {
                System.out.println("You entered: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e);
        }
    }
}

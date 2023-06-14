import java.sql.*;

public class Q23 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase"; 
        String username = "your-username"; 
        String password = "your-password"; 

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT id, name, age FROM employees";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

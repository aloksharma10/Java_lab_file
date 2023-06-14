import java.sql.*;

public class Q22 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase"; 
        String username = "your-username"; 
        String password = "your-password"; 

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String insertQuery = "INSERT INTO employees (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setInt(1, 1);
            insertStatement.setString(2, "John Doe");
            insertStatement.setInt(3, 30);
            insertStatement.executeUpdate();
            System.out.println("Data inserted successfully.");
            String updateQuery = "UPDATE employees SET age = ? WHERE id = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setInt(1, 35);
            updateStatement.setInt(2, 1);
            updateStatement.executeUpdate();
            System.out.println("Data updated successfully.");
            updateStatement.close();
            insertStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

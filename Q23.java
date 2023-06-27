import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q23 {
    public static void main(String[] args) {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "admin");
            String s = "select * from aaa";
            Statement st = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(s);
           while(rs.next()){
               System.out.print("roll no "+  rs.getInt("rollno")+"  ");
               System.out.println("name "+  rs.getString("name"));
           }
            rs.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Exception during connection " + e);
        }
     }
}

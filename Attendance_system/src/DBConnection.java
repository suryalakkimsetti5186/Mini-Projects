import java.sql.DriverManager;
import java.sql.Connection;
public class DBConnection {
   private static String url= "jdbc:mysql://localhost:3307/attendance_system";
    private static String user="root";
    private static String password="9885640717";
    public static Connection connect(){
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            System.out.println("connecctio succesfull");
            return c;
        }
    catch(Exception e){
            e.printStackTrace();
    }
return null;}
}
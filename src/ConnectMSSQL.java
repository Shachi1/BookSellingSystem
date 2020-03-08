
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMSSQL {
    
    public Connection connection;
            
    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "1234567");
            
                        System.out.println("AAA");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            System.out.println("C");

            Statement statement = connection.createStatement();
            System.out.println("A");
            ResultSet resultSet = statement
                    .executeQuery("SELECT Email FROM [User]");
            System.out.println("AB");

            
            
            while (resultSet.next()) {
                
                System.out.println("Customer NAME:" + 
                        resultSet.getString("Email"));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
    }
    
}

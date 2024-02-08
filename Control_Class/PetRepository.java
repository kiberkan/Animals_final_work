package Control_Class;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;




public class PetRepository {

    public static Connection getConnection() throws SQLException, IOException {

        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("src/Resources/database.properties")) {
    
            props.load(fis);
            String url = props.getProperty("url");
            String username = props.getProperty("username");
            String password = props.getProperty("password");
    
            return DriverManager.getConnection(url, username, password);
        }
    }
}



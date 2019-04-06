
import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayada Khaled
 */
public class DataBaseConnection {
  
    public static DataSource getMySQLDataSource() {
         String URL="jdbc:mysql://localhost:3306/emp";
         String USERNAME="root";
         String PASSWORD="root";
         
        MysqlDataSource mysqlDataSource = null;
       
            mysqlDataSource = new MysqlDataSource();
            mysqlDataSource.setURL(URL);
            mysqlDataSource.setUser(USERNAME);
            mysqlDataSource.setPassword(PASSWORD);
       
        
        return mysqlDataSource;
    }
    
}

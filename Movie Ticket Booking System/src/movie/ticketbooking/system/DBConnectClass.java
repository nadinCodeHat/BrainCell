package movie.ticketbooking.system;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author nadinCodeHat
 */
public class DBConnectClass {
    private static final String servername = "localhost";
    private static final String username = "root";
    private static final String dbname = "braincelldb";
    private static final Integer portnumber = 3306;
    private static final String password = "";
    
    public static Connection getConnection() throws SQLException{
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        cnx = datasource.getConnection();
        
        return cnx;
    }
}

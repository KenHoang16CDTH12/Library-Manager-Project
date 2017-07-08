package kenhoang.connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by sample on 5/27/17.
 */
public class ConnectAccess {
    public static Connection getConnect (String databasePath) {
        Connection connect = null;
        String strConnect = "jdbc:ucanaccess://" + databasePath;
        try {
            connect = DriverManager.getConnection(strConnect);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return connect;
    }
}

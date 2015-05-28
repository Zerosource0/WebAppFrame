package DataSource;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author marcj_000
 */
public class DBFacade {

    private ProjectMapper pm;
    private Connection con;

    private static DBFacade instance;

    private DBFacade() {
        pm = new ProjectMapper();
        con = DBconnector.getInstance().getConnection();
    }

    public static DBFacade getInstance() {
        if (instance == null) {
            instance = new DBFacade();
        }
        return instance;
    }
}
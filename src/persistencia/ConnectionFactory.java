package persistencia;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public interface ConnectionFactory {

    Connection getConnection() throws SQLException;

}

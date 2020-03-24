package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public class MySQLConnectionFactory implements ConnectionFactory {

    private final String CONNECTION_STRING;
    private final String USER;
    private final String PASSWORD;

    public MySQLConnectionFactory(String host, String database, int port, String user, String password) {

        this.USER = user;
        this.PASSWORD = password;
        this.CONNECTION_STRING = String.format("jdbc:mysql://%s:%d/%s?serverTimezone=UTC", host, port, database);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.CONNECTION_STRING, this.USER, this.PASSWORD);
    }
}

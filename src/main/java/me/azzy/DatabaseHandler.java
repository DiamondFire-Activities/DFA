package me.azzy;
import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

public class DatabaseHandler {

    private static final MysqlDataSource source = new MysqlDataSource();

    static {
        source.setUrl("jdbc:mysql://localhost/mcdiamondfire?useSSL=false&allowPublicKeyRetrieval=true");
        source.setUser(DiamondFire.getConfiguration().getString("database_user"));
        source.setPassword(DiamondFire.getConfiguration().getString("database_password"));
    }

    public static Connection getConnection() throws SQLException {
        return source.getConnection();
    }
}
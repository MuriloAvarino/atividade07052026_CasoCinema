package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static final String URL =
            "jdbc:sqlite:cinema.db";

    public static Connection conectar() {

        try {
            return DriverManager.getConnection(URL);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

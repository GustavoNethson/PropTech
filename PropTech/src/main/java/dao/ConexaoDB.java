package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    private static final String URL = "jdbc:mysql://localhost:5434/PropTechDB";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Unipar";

    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: ", e);
        }
    }
}
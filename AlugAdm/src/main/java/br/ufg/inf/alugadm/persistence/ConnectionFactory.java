package br.ufg.inf.alugadm.persistence;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

    private static java.sql.Connection connection = null;

    public ConnectionFactory() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
//        connection = DriverManager.getConnection("jdbc:postgresql://0.tcp.ngrok.io:19094/postgres", "postgres", "avestrus");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "avestrus");
    }

    public static java.sql.Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                new ConnectionFactory();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }

        return connection;
    }
//
//    private Connection connection = null;
//
//    public Connection getConnection() throws SQLException {
//        if (connection == null) {
//            try {
//                Class.forName("org.postgresql.Driver");
//
//                String usuario = "postgres";
//                String senha = "suaSenha";
//
//                String url_local = "jdbc:postgresql://localhost:5432/alugadm";
//
//                connection = DriverManager.getConnection(url_local, usuario, senha);
//            } catch (ClassNotFoundException e) {
//
//            }
//        }
//        return connection;
//    }
}

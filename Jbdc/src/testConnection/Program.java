package testConnection;

import db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        // pegando uma conexão com o banco de dados
        Connection coon = DB.getConnection();

        // fechando conexão
        DB.closeConnection();
    }
}

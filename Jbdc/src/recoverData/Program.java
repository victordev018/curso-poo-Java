package recoverData;    // recuperar dados

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        // instanciando objetos para consultar o banco de dados
        Connection conn = null;         // objetdo de conexão ao banco
        Statement statement = null;     // prepara comando SQL
        ResultSet result = null;        // guarda resultado da consulta em um objeto na forma de tabela

        try {

            // realizando a conexão
            conn = DB.getConnection();
            // instanciando statement (comando sql)
            statement = conn.createStatement();
            // executando query e guardando o resultado
            result = statement.executeQuery("select * from department");

            // percorrendo a tabela de resultado e exibindo os dados da consulta
            while (result.next()){
                System.out.println("id: " + result.getInt("Id") + ", name: " + result.getString("Name"));
            }
        }
        catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }
}

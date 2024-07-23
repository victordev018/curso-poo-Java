package transactionDemo;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        // instanciando objetos de conexão ao banco de dados e de envios de comandos sql
        Connection conn = null;
        Statement st = null;

        try {

            // estabelecendo uma conexão ao banco de dados
            conn = DB.getConnection();

            // não confirme as operações automaticamente, todas ficarão pendentes até segunda ordem
            conn.setAutoCommit(false);

            st = conn.createStatement();

            // operação 1
            int operationOne = st.executeUpdate("UPDATE seller SET BaseSalary = 2000 WHERE departmentId = 1");

            // interrompendo a transação
            //int num = 1;
            //if (num < 2){
            //    throw new SQLException("Fake error");
            //}

            // operação 2
            int operationTwo = st.executeUpdate("UPDATE seller SET BaseSalary = 3000 WHERE departmentId = 2");

            // confirmando transações
            conn.commit();

            // exibindo resultado das operações
            System.out.println("operation one : rows affected : " + operationOne);
            System.out.println("operation two : rows affected : " + operationTwo);
        }
        catch (SQLException e){
            try {
                // voltando ao estado anterior ao banco, antes de começar as operações
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            }
            catch (SQLException e1) {
                throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
            }
        }
    }
}

package updateData;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) {

        // instanciando objteos para conexão ao banco e para preparar o comando SQL
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            // estabelecendo a conexão ao banco de dados
            conn = DB.getConnection();
            // preparando código SQL a ser executado
            ps = conn.prepareStatement(
                    "UPDATE seller "                        // atualize na tabela seller
                       +"SET BaseSalary = BaseSalary + ? "  // Setando na coluna um incremento x
                       +"WHERE "                            // onde
                       +"(DepartmentId = ?)"                // a linha faça parte de um departamento y
            );

            // setando valores para incremento x e departamentp y
            ps.setDouble(1, 200.0);
            ps.setInt(2, 2);

            // executando a query e guardando a informação de quantas linhas da tabela foram afetadas
            int rowsAffected = ps.executeUpdate();

            // exibindo a quantidade de linhas modificadas/afetadas
            System.out.println("Done! rows affected: " + rowsAffected);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}

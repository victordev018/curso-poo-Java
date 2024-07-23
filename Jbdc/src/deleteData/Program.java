package deleteData;

import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

         // instanciando objetos de conexão ao banco e de preparo de comando SQL
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            // estabelecendo uma conexão ao banco de dados
            conn = DB.getConnection();
            // preparando comando sql a ser executado
            ps = conn.prepareStatement(
                    "DELETE FROM seller "   // delete da tabela seller
                       +"WHERE "                // onde
                       +"(Id = ?)"              // tenha o id igual um id x que será informado
            );

            // definindo id x do seller a ser apagado do database
            ps.setInt(1, 7);

            // executando o comando e guardando a quantidade de linhas afetadas
            int rowsAffected = ps.executeUpdate();

            // exibindo a quantiade de linhas afetadas
            System.out.println("Done! rows affected: " + rowsAffected);
        }
        catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}

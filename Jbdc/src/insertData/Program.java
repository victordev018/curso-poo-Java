package insertData;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        // instanciando objetos de conexão e envio de comandos ao banco de dados
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            // criando u objeto de formatar dadtas
            SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

            // realizando a conexão ao banco de dados
            conn = DB.getConnection();
            // preparando comando para inserir dados em uma determidada tabela
            ps = conn.prepareStatement(
                    "INSERT INTO seller "                                       // insira na tabela seller
                       +"(Name, Email, BirthDate, BaseSalary, DepartmentId) "   // nestes campos informados
                       +"VALUES "                                               // os seguintes valores
                       +"(?, ?, ?, ?, ?)"                                       // estão ocultos e serão preenchidos em breve
            , Statement.RETURN_GENERATED_KEYS);                                 // guarda uma tabela do id(s) gerado(s)

            // defindo os valores (setType(indexParametro, valor))
            ps.setString(1, "João");
            ps.setString(2, "joao@gmail.com");
            ps.setDate(3, new java.sql.Date(fmt.parse("24/06/2005").getTime()));
            ps.setDouble(4, 5000.0);
            ps.setInt(5, 2);

            // executando a instrução no banco de dados, o método executeUpdate() retorna o número de linhas modificadas
            int rowsAffected = ps.executeUpdate();

            // se estiver inserido na tabela as novas informações
            if (rowsAffected > 0){
                // guarda uma tabela dos ids gerados na inserção
                ResultSet rs = ps.getGeneratedKeys();

                while (rs.next()){
                    int id = rs.getInt(1);      // pega o elemento da coluna 1
                    System.out.println("Done! id: " + id);
                }
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ParseException e) {
           e.printStackTrace();
        }
        finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}

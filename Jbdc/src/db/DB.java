package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    // instanciando um objeto de conexão SQL
    private static Connection conn = null;

    // método para realizar a conexão com o banco de dados
    public static Connection getConnection() {
        // se o valor do objeto de conexão for nula
        if (conn == null){
            // realize a conexão
            try {
                // pega as configurações de propriedade do banco de dados
                Properties prop = loadProperties();
                String url = prop.getProperty("dburl");

                // realizando a conexão e guardando no objeto conn
                conn = DriverManager.getConnection(url, prop);
            }
            catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    // método para fechar uma conexão
    public static void closeConnection() {

        // caso a conexão esteja aberta
        if (conn != null) {
            try {
                conn.close();
            }
            catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

    // método auxiliar para carregar as propiedades de db.properties
    private static Properties loadProperties() {

        // tentando abrir o arquivo de properties
        try (FileInputStream fs = new FileInputStream("db.properties")) {

            // instanciando um Properties e carregaando as informações do arquivo nele
            Properties props = new Properties();
            props.load(fs);
            return props;
        }
        catch (IOException e){
            throw new DbException(e.getMessage());
        }
    }
}

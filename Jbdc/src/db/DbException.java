package db;

public class DbException extends RuntimeException {

    // setting serial version
    private static final long serialVersionUID = 1L;

    public DbException(String message){
        super(message);
    }

}

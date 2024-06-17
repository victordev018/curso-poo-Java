package WithdrawExercise.model.exceptions;

public class WithdrawException extends RuntimeException {
    // definindo versão do serialVersionUID
    private static final long serialVersionUID = 1L;

    // construtor
    public WithdrawException (String message){
        super(message);
    }
}

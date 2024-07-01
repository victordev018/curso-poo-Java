package accountExercise.model.exceptions;

import java.io.Serial;

// classe referente a exceção relacionada a transações
public class TransationException extends RuntimeException {
    // definindo o valor do serialVersionUID;
    @Serial
    private static final long serialVersionUID = 1L;

    public TransationException(String message){
        super(message);
    }
}

package ReservationExercise.model.exceptions;

public class DomainException extends RuntimeException {
    // definindo a versão do serialVersinUID
    private static final long serialVersionUID = 1L;

    // construtor
    public DomainException (String message){
        super(message);
    }

}

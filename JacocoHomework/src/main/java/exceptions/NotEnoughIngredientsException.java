package exceptions;

public class NotEnoughIngredientsException extends RuntimeException{
    public NotEnoughIngredientsException() {
    }

    public NotEnoughIngredientsException(String message) {
        super(message);
    }
}

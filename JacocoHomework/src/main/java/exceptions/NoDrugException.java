package exceptions;

public class NoDrugException extends RuntimeException{

    public NoDrugException() {
    }

    public NoDrugException(String message) {
        super(message);
    }
}

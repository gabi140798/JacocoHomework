package exceptions;

public class BadQualityException extends RuntimeException{

    public BadQualityException() {
    }

    public BadQualityException(String message) {
        super(message);
    }
}

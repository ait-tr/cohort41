package code.userException;

public class ProductValidationException extends RuntimeException{
    public ProductValidationException(String message) {
        super(message);
    }
}

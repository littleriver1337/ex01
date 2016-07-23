package testStreams.persistence.exception;

/**
 * Created by Matt on 7/23/16.
 */
public class JsonApiException extends RuntimeException {

    private final String message;

    public JsonApiException(String  message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

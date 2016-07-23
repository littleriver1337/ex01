package testStreams.persistence.exception;

import io.katharsis.errorhandling.ErrorData;
import io.katharsis.errorhandling.ErrorResponse;
import io.katharsis.errorhandling.mapper.JsonApiExceptionMapper;
import io.katharsis.response.HttpStatus;

/**
 * Created by Matt on 7/23/16.
 */
public class testStreamsExceptionManager implements JsonApiExceptionMapper<JsonApiException> {

    @Override
    public ErrorResponse toErrorResponse(JsonApiException exception) {
        return ErrorResponse.builder()
                .setStatus(HttpStatus.INTERNAL_SERVER_ERROR_500)
                .setSingleErrorData(ErrorData.builder()
                    .setDetail(exception.getMessage())
                    .build())
                .build();
    }
}

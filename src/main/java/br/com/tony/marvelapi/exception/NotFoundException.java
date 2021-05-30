package br.com.tony.marvelapi.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BusinessException {
    public NotFoundException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }
}

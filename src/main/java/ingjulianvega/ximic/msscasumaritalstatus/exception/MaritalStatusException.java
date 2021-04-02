package ingjulianvega.ximic.msscasumaritalstatus.exception;

import lombok.Getter;

@Getter
public class MaritalStatusException extends RuntimeException {

    private final String code;

    public MaritalStatusException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}


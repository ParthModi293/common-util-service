package org.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseException extends RuntimeException {

    private int rCode;
    private HttpStatus rStatus;
    private String displayMessage;
    private String rMsg;

    public BaseException(int rCode, HttpStatus rStatus, String displayMessage, String rMsg) {
        super(displayMessage);
        this.rCode = rCode;
        this.rStatus = rStatus;
        this.displayMessage = displayMessage;
        this.rMsg = rMsg;
    }
}

package org.common.exception;


import org.springframework.http.HttpStatus;

public class ValidationException extends BaseException {

  private Object object;

  public ValidationException(int rCode, HttpStatus rStatus, String displayMessage, String rMsg, Object object) {
    super(rCode, rStatus, displayMessage, rMsg);
    this.object = object;
  }
}

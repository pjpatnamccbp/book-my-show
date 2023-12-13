package com.bookmyshow.theatreservice.exception;

import lombok.Getter;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Getter
public class RequestInvalidException extends Exception{
    private String errorMessage;
    public RequestInvalidException(String errorMessage){
        this.errorMessage = errorMessage;
    }
}

package com.bookmyshow.theatreservice.exception;

import lombok.Getter;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Getter
public class TheatreNotFoundException extends RuntimeException {
    private String errorMessage;
    public TheatreNotFoundException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

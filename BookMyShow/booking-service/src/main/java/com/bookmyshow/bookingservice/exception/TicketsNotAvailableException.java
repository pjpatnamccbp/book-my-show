package com.bookmyshow.bookingservice.exception;

import lombok.Getter;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Getter
public class TicketsNotAvailableException extends RuntimeException{
    private String errorMessage;

    public TicketsNotAvailableException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

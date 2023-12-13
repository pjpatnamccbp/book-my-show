package com.bookmyshow.bookingservice.controller;

import com.bookmyshow.bookingservice.dto.BookingResponse;
import com.bookmyshow.bookingservice.exception.TicketsNotAvailableException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@RestControllerAdvice
public class BookingControllerAdvise {
    @ExceptionHandler(TicketsNotAvailableException.class)
    public ResponseEntity<BookingResponse> handleTicketsNotAvailableException(TicketsNotAvailableException exception){
        BookingResponse bookingResponse = new BookingResponse();
        bookingResponse.setResponseMessage(exception.getErrorMessage());
        return new ResponseEntity<>(bookingResponse, HttpStatus.BAD_REQUEST);
    }
}

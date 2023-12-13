package com.bookmyshow.theatreservice.controller;

import com.bookmyshow.theatreservice.dto.TheatreResponse;
import com.bookmyshow.theatreservice.exception.RequestInvalidException;
import com.bookmyshow.theatreservice.exception.TheatreNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@RestControllerAdvice
public class TheatreControllerAdvice {
    @ExceptionHandler(TheatreNotFoundException.class)
    public TheatreResponse handleTheatreNotFoundException(TheatreNotFoundException exception){
        TheatreResponse theatreResponse = new TheatreResponse();
        theatreResponse.setResponseMessage(exception.getErrorMessage());
        return theatreResponse;
    }

    @ExceptionHandler(RequestInvalidException.class)
    public TheatreResponse handleRequestInvalidException(RequestInvalidException exception){
        TheatreResponse theatreResponse = new TheatreResponse();
        theatreResponse.setResponseMessage(exception.getErrorMessage());
        return theatreResponse;
    }
}

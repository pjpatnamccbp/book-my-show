package com.bookmyshow.theatreservice.validator;

import com.bookmyshow.theatreservice.dto.TheatreRequest;
import com.bookmyshow.theatreservice.exception.RequestInvalidException;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Component
public class RequestValidator {

    public void validateRequest(TheatreRequest theatreRequest) throws RequestInvalidException {
        if(theatreRequest == null){
            throw new RequestInvalidException("invalid request");
        }
        if(theatreRequest.getName().equals("") || theatreRequest.getName().equals(null) || theatreRequest.getName().length()<3){
            throw new RequestInvalidException("invalid name");
        }
        if(theatreRequest.getMovie().equals("") || theatreRequest.getMovie().equals(null) || theatreRequest.getMovie().length()<3){
            throw new RequestInvalidException("invalid movie");
        }
        if(theatreRequest.getLocation().equals("") || theatreRequest.getLocation().equals(null) || theatreRequest.getLocation().length()<3){
            throw new RequestInvalidException("invalid location");
        }
        if(theatreRequest.getTicketPrice() <= 0){
            throw new RequestInvalidException("invalid ticket price");
        }
        if(theatreRequest.getAvailableTickets() <= 0 ){
            throw new RequestInvalidException("invalid available tickets");
        }
        if(theatreRequest.getShowDate().equals("") || theatreRequest.getShowDate().equals(null) ||theatreRequest.getShowDate().length() < 9){
            throw new RequestInvalidException("invalid showdate");
        }
    }
}

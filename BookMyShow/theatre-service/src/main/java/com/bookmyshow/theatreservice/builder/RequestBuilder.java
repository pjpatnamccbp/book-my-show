package com.bookmyshow.theatreservice.builder;

import com.bookmyshow.theatreservice.dto.Theatre;
import com.bookmyshow.theatreservice.dto.TheatreRequest;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Component
public class RequestBuilder {
    public Theatre buildTheatre(TheatreRequest theatreRequest) {
        Theatre theatre = new Theatre();

        theatre.setName(theatreRequest.getName());
        theatre.setMovie(theatreRequest.getMovie());
        theatre.setShowDate(theatreRequest.getShowDate());
        theatre.setLocation(theatreRequest.getLocation());
        theatre.setTicketPrice(theatreRequest.getTicketPrice());
        theatre.setAvailableTickets(theatreRequest.getAvailableTickets());

        return theatre;
    }

    public Theatre buildTheatre(Theatre theatre, TheatreRequest theatreRequest) {
        theatre.setName(theatreRequest.getName());
        theatre.setMovie(theatreRequest.getMovie());
        theatre.setShowDate(theatreRequest.getShowDate());
        theatre.setLocation(theatreRequest.getLocation());
        theatre.setTicketPrice(theatreRequest.getTicketPrice());
        theatre.setAvailableTickets(theatreRequest.getAvailableTickets());

        return theatre;

    }
}

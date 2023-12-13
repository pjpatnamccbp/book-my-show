package com.bookmyshow.theatreservice.builder;

import com.bookmyshow.theatreservice.dto.Theatre;
import com.bookmyshow.theatreservice.dto.TheatreDto;
import com.bookmyshow.theatreservice.dto.TheatreResponse;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Component
public class ResponseBuilder {
    public TheatreResponse buildTheatreResponse(Theatre savedTheatre) {
        TheatreResponse theatreResponse = new TheatreResponse();

        theatreResponse.setResponseCode("0");
        theatreResponse.setResponseMessage("success");

        TheatreDto theatreDto = new TheatreDto();
        theatreDto.setName(savedTheatre.getName());
        theatreDto.setLocation(savedTheatre.getLocation());
        theatreDto.setMovie(savedTheatre.getMovie());
        theatreDto.setShowDate(savedTheatre.getShowDate());
        theatreDto.setTicketPrice(savedTheatre.getTicketPrice());
        theatreDto.setAvailableTickets(savedTheatre.getAvailableTickets());

        theatreResponse.setTheatre(theatreDto);

        return theatreResponse;
    }

    public TheatreResponse buildTheatreResponse(String message) {
        TheatreResponse theatreResponse = new TheatreResponse();

        theatreResponse.setResponseCode("0");
        theatreResponse.setResponseMessage(message);
        return theatreResponse;
    }

    public TheatreDto buildTheatreDto(Theatre theatre) {
        TheatreDto theatreDto = new TheatreDto();
        theatreDto.setName(theatre.getName());
        theatreDto.setLocation(theatre.getLocation());
        theatreDto.setMovie(theatre.getMovie());
        theatreDto.setShowDate(theatre.getShowDate());
        theatreDto.setTicketPrice(theatre.getTicketPrice());
        theatreDto.setAvailableTickets(theatre.getAvailableTickets());
        return theatreDto;
    }
}

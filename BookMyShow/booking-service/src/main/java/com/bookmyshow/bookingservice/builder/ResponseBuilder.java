package com.bookmyshow.bookingservice.builder;

import com.bookmyshow.bookingservice.dto.BookingRequest;
import com.bookmyshow.bookingservice.dto.BookingResponse;
import com.bookmyshow.bookingservice.dto.TheatreDto;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Component
public class ResponseBuilder {
    public BookingResponse buildBookingResponse(BookingRequest bookingRequest, TheatreDto theatreDto) {
        BookingResponse bookingResponse = new BookingResponse();
        bookingResponse.setTickets(bookingRequest.getTickets());
        bookingResponse.setResponseMessage("Tickets Booked!!!");
        bookingResponse.setMovie(bookingRequest.getMovie());
        bookingResponse.setTheatre(bookingRequest.getTheatre());
        bookingResponse.setAmount(bookingRequest.getTickets() * theatreDto.getTicketPrice());
        return bookingResponse;
    }
}

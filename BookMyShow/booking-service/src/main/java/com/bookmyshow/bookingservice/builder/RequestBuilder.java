package com.bookmyshow.bookingservice.builder;

import com.bookmyshow.bookingservice.dto.BookingDetails;
import com.bookmyshow.bookingservice.dto.BookingRequest;
import com.bookmyshow.bookingservice.dto.TheatreDto;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Component
public class RequestBuilder {
    public BookingDetails buildBookingDetails(BookingRequest bookingRequest, TheatreDto theatreDto) {
        BookingDetails bookingDetails = new BookingDetails();

        bookingDetails.setMovie(bookingRequest.getMovie());
        bookingDetails.setTheatre(bookingRequest.getTheatre());
        bookingDetails.setTickets(bookingRequest.getTickets());
        bookingDetails.setAmount(bookingRequest.getTickets() * theatreDto.getTicketPrice());
        return bookingDetails;
    }
}

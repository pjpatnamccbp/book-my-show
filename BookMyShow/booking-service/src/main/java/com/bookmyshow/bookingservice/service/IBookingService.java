package com.bookmyshow.bookingservice.service;

import com.bookmyshow.bookingservice.dto.BookingRequest;
import com.bookmyshow.bookingservice.dto.BookingResponse;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
public interface IBookingService {
    BookingResponse bookTickets(BookingRequest bookingRequest);
}

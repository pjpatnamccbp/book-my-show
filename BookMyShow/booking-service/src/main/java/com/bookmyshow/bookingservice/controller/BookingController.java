package com.bookmyshow.bookingservice.controller;

import com.bookmyshow.bookingservice.dto.BookingRequest;
import com.bookmyshow.bookingservice.dto.BookingResponse;
import com.bookmyshow.bookingservice.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@RestController
@RequestMapping("/v1/booking")
public class BookingController {
    @Autowired
    private IBookingService bookingService;

    @PostMapping("/bookTickets")
    public ResponseEntity<BookingResponse> bookTickets(@RequestBody BookingRequest bookingRequest){
        BookingResponse bookingResponse = bookingService.bookTickets(bookingRequest);
        return new ResponseEntity<>(bookingResponse, HttpStatus.OK);
    }


}

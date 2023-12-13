package com.bookmyshow.bookingservice.service;

import com.bookmyshow.bookingservice.builder.RequestBuilder;
import com.bookmyshow.bookingservice.builder.ResponseBuilder;
import com.bookmyshow.bookingservice.dao.IBookingRepository;
import com.bookmyshow.bookingservice.dto.BookingDetails;
import com.bookmyshow.bookingservice.dto.BookingRequest;
import com.bookmyshow.bookingservice.dto.BookingResponse;
import com.bookmyshow.bookingservice.dto.TheatreDto;
import com.bookmyshow.bookingservice.exception.TicketsNotAvailableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Service
public class BookingServiceImpl implements IBookingService{
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private IBookingRepository bookingRepository;

    @Autowired
    private RequestBuilder requestBuilder;
    @Autowired
    private ResponseBuilder responseBuilder;
    @Override
    public BookingResponse bookTickets(BookingRequest bookingRequest) {

        String theatreUrl = "http://localhost:8081/v1/theatres/get/"+bookingRequest.getTheatre();
        //String theatreBookUrl = "http://localhost:8081/v1/theatres/update/"

        TheatreDto theatreDto = restTemplate.getForObject(theatreUrl,TheatreDto.class);
        BookingResponse bookingResponse;
        if(bookingRequest.getTickets() < theatreDto.getAvailableTickets()){
            bookingRepository.save(requestBuilder.buildBookingDetails(bookingRequest,theatreDto));

            bookingResponse = responseBuilder.buildBookingResponse(bookingRequest,theatreDto);
        }else{
            throw new TicketsNotAvailableException(String.format("Oops Tickets Not available"));
        }

        return bookingResponse;
    }
}

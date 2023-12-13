package com.bookmyshow.bookingservice.dto;

import lombok.Data;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Data
public class BookingRequest {
    private String movie;
    private String theatre;
    private Integer tickets;
}

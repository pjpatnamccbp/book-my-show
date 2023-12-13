package com.bookmyshow.bookingservice.dto;

import lombok.Data;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Data
public class TheatreDto {
    private String name;
    private String location;
    private String movie;
    private Double ticketPrice;
    private Integer availableTickets;
    private String showDate;
}

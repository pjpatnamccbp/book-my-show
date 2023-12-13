package com.bookmyshow.theatreservice.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Data
public class TheatreRequest {
    private String name;
    private String location;
    private String movie;
    private Double ticketPrice;
    private Integer availableTickets;
    private String showDate;
}

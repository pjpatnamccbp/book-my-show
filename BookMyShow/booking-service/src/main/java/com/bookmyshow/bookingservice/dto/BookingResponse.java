package com.bookmyshow.bookingservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingResponse {
    private String responseMessage;
    private String movie;
    private String theatre;
    private Integer tickets;
    private Double amount;
}

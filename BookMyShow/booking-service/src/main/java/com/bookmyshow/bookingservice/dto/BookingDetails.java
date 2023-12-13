package com.bookmyshow.bookingservice.dto;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Data
@Entity
public class BookingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    private String movie;
    private String theatre;
    private Integer tickets;
    private Double amount;
}

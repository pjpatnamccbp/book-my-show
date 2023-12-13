package com.bookmyshow.theatreservice.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Entity
@Table(name = "theatres")
@Data
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer theatreId;

    private String name;
    private String location;
    private String movie;
    private Double ticketPrice;
    private Integer availableTickets;
    private String showDate;
}

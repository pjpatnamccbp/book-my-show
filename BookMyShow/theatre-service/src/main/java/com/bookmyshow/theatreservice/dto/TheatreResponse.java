package com.bookmyshow.theatreservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TheatreResponse {
    private String responseCode;
    private String responseMessage;
    private TheatreDto theatre;
}

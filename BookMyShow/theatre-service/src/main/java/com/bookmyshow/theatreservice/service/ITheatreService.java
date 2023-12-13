package com.bookmyshow.theatreservice.service;

import com.bookmyshow.theatreservice.dto.Theatre;
import com.bookmyshow.theatreservice.dto.TheatreDto;
import com.bookmyshow.theatreservice.dto.TheatreRequest;
import com.bookmyshow.theatreservice.dto.TheatreResponse;

import java.util.List;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
public interface ITheatreService {
    TheatreResponse addTheatre(TheatreRequest theatreRequest);
    TheatreResponse updateTheatre(Integer theatreId,TheatreRequest theatreRequest);

    TheatreResponse getTheatre(Integer theatreId);
    List<Theatre> getTheatres();

    TheatreResponse deleteTheatre(Integer theatreId);

    List<Theatre> getTheatresByMovie(String movie);

    TheatreDto getTheatreByName(String name);
}

package com.bookmyshow.theatreservice.service;

import com.bookmyshow.theatreservice.builder.RequestBuilder;
import com.bookmyshow.theatreservice.builder.ResponseBuilder;
import com.bookmyshow.theatreservice.dao.ITheatreRepository;
import com.bookmyshow.theatreservice.dto.Theatre;
import com.bookmyshow.theatreservice.dto.TheatreDto;
import com.bookmyshow.theatreservice.dto.TheatreRequest;
import com.bookmyshow.theatreservice.dto.TheatreResponse;
import com.bookmyshow.theatreservice.exception.TheatreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Service
public class TheatreServiceImpl implements ITheatreService{

    @Autowired
    private ITheatreRepository theatreRepository;
    @Autowired
    private RequestBuilder requestBuilder;

    @Autowired
    private ResponseBuilder responseBuilder;

    @Override
    public TheatreResponse addTheatre(TheatreRequest theatreRequest) {
        Theatre savedTheatre = theatreRepository.save(requestBuilder.buildTheatre(theatreRequest));

        return responseBuilder.buildTheatreResponse(savedTheatre);
    }

    @Override
    public TheatreResponse updateTheatre(Integer theatreId,TheatreRequest theatreRequest) {
        Theatre theatre = theatreRepository.findById(theatreId).orElseThrow(()->new TheatreNotFoundException(String.format("theatre with id %d not found",theatreId)));
        Theatre updatedTheatre = theatreRepository.save(requestBuilder.buildTheatre(theatre,theatreRequest));
        return responseBuilder.buildTheatreResponse(updatedTheatre);
    }

    @Override
    public TheatreResponse getTheatre(Integer theatreId) {
        Theatre theatre = theatreRepository.findById(theatreId).orElseThrow(()->new TheatreNotFoundException(String.format("theatre with id %d not found",theatreId)));
        return  responseBuilder.buildTheatreResponse(theatre);
    }

    @Override
    public List<Theatre> getTheatres() {

        return theatreRepository.findAll();
    }

    @Override
    public TheatreResponse deleteTheatre(Integer theatreId) {
        theatreRepository.findById(theatreId).orElseThrow(()->new TheatreNotFoundException(String.format("theatre with id %d not found",theatreId)));
        theatreRepository.deleteById(theatreId);
        return responseBuilder.buildTheatreResponse(String.format("theatre with id %d has been removed from db!!",theatreId));
    }

    @Override
    public List<Theatre> getTheatresByMovie(String movie) {
        return theatreRepository.findAllByMovie(movie);
    }

    @Override
    public TheatreDto getTheatreByName(String name) {
        Theatre theatre = theatreRepository.findByName(name).orElseThrow(()->new TheatreNotFoundException(String.format("theatre with name %s is not found",name)));
        System.out.println(theatre.toString());
        return responseBuilder.buildTheatreDto(theatre);
    }
}

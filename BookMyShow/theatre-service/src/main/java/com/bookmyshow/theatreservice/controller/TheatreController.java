package com.bookmyshow.theatreservice.controller;

import com.bookmyshow.theatreservice.dto.Theatre;
import com.bookmyshow.theatreservice.dto.TheatreDto;
import com.bookmyshow.theatreservice.dto.TheatreRequest;
import com.bookmyshow.theatreservice.dto.TheatreResponse;
import com.bookmyshow.theatreservice.exception.RequestInvalidException;
import com.bookmyshow.theatreservice.service.ITheatreService;
import com.bookmyshow.theatreservice.validator.RequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@RestController
@RequestMapping("/v1/theatres")
public class TheatreController {
    @Autowired
    private ITheatreService theatreService;
    @Autowired
    private RequestValidator requestValidator;
    @PostMapping("/add")
    public ResponseEntity<TheatreResponse> addTheatre(@RequestBody TheatreRequest theatreRequest) throws RequestInvalidException {
        requestValidator.validateRequest(theatreRequest);
        TheatreResponse theatreResponse = theatreService.addTheatre(theatreRequest);
        return new ResponseEntity<>(theatreResponse, HttpStatus.CREATED);
    }
    @PutMapping("/update/{theatreId}")
    public ResponseEntity<TheatreResponse> updateTheatre(@PathVariable Integer theatreId,
                                                         @RequestBody TheatreRequest theatreRequest) throws RequestInvalidException {
        requestValidator.validateRequest(theatreRequest);
        TheatreResponse theatreResponse = theatreService.updateTheatre(theatreId,theatreRequest);
        return new ResponseEntity<>(theatreResponse, HttpStatus.OK);
    }

    @GetMapping("/{theatreId}")
    public ResponseEntity<TheatreResponse> getTheatre(@PathVariable Integer theatreId){
        TheatreResponse theatreResponse = theatreService.getTheatre(theatreId);
        return new ResponseEntity<>(theatreResponse, HttpStatus.FOUND);
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<TheatreDto> getTheatreByName(@PathVariable String name){

        return new ResponseEntity<>(theatreService.getTheatreByName(name), HttpStatus.FOUND);
    }
    @GetMapping()
    public ResponseEntity<List<Theatre>> getTheatres(){
        return new ResponseEntity<>(theatreService.getTheatres(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Theatre>> getTheatresByMovie(@RequestParam("movie") String movie){
        return new ResponseEntity<>(theatreService.getTheatresByMovie(movie), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{theatreId}")
    public ResponseEntity<TheatreResponse> deleteTheatre(@PathVariable Integer theatreId){
        return new ResponseEntity<>(theatreService.deleteTheatre(theatreId), HttpStatus.OK);
    }


}

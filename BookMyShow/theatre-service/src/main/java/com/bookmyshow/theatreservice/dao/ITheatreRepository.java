package com.bookmyshow.theatreservice.dao;

import com.bookmyshow.theatreservice.dto.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
public interface ITheatreRepository extends JpaRepository<Theatre,Integer> {
    List<Theatre> findAllByMovie(String name);

    Optional<Theatre> findByName(String name);
}

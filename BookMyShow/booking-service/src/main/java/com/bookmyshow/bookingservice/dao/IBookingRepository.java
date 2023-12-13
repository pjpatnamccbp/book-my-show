package com.bookmyshow.bookingservice.dao;

import com.bookmyshow.bookingservice.dto.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Repository
public interface IBookingRepository extends JpaRepository<BookingDetails,Integer> {
}

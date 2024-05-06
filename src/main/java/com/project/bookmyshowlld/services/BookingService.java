package com.project.bookmyshowlld.services;


import com.project.bookmyshowlld.models.*;
import com.project.bookmyshowlld.repositories.ShowRepository;
import com.project.bookmyshowlld.repositories.ShowSeatRepository;
import com.project.bookmyshowlld.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    UserRepository userRepository;

    ShowRepository showRepository;

    ShowSeatRepository showSeatRepository;

    @Autowired
    BookingService(UserRepository userRepository, ShowRepository showRepository, ShowSeatRepository showSeatRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
    }

    public Booking bookTicket(Integer userId, Integer showId, List<Integer> showSeatIds) {

        Booking booking = new Booking();
        Optional<User> userOptional= userRepository.findById(userId);

        if(userOptional.isPresent()) {
            booking.setUser(userOptional.get());
        }
        else
            throw new RuntimeException("No user found");

        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isPresent()) {
            booking.setShow(showOptional.get());
        }
        else
            throw new RuntimeException("No show found");

        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);
        for (ShowSeat showSeat : showSeats) {

            if (showSeat.getStatus().equals(ShowSeatStatus.Available)) {
                throw new RuntimeException("Selected seats are not available");
            }
            showSeat.setBlockedAt(LocalDateTime.now());
            showSeat.setStatus(ShowSeatStatus.Blocked);
        }
        showSeatRepository.saveAll(showSeats);
        booking.setShowSeatList(showSeats);
        booking.setBookingDate(LocalDateTime.now());
        booking.setPaymentsList(new ArrayList<>());
        return booking;
    }
}

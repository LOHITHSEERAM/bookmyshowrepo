package com.project.bookmyshowlld.controllers;

import com.project.bookmyshowlld.dtos.BookingTicketRequestDTO;
import com.project.bookmyshowlld.dtos.BookingTicketResponseDTO;
import com.project.bookmyshowlld.dtos.ResponseType;
import com.project.bookmyshowlld.models.Booking;
import com.project.bookmyshowlld.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BookingController {

    BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("bookticket")
    public BookingTicketResponseDTO bookTicket(@RequestBody BookingTicketRequestDTO bookingTicketRequestDTO) {

        BookingTicketResponseDTO bookingTicketResponseDTO = new BookingTicketResponseDTO();
        try {

           Booking b =  bookingService.bookTicket(bookingTicketRequestDTO.getUserId(),
                    bookingTicketRequestDTO.getShowId(),
                    bookingTicketRequestDTO.getShowSeatIdList());
            bookingTicketResponseDTO.setBooking(b);
            bookingTicketResponseDTO.setResponseType(ResponseType.SUCCESS);
        }
        catch(Exception e) {
            bookingTicketResponseDTO.setResponseType(ResponseType.FAILED);
            bookingTicketResponseDTO.setFailureReason(e.getMessage());
        }

        return bookingTicketResponseDTO;
    }
}

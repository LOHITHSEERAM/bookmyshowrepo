package com.project.bookmyshowlld.dtos;
import com.project.bookmyshowlld.models.Booking;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookingTicketResponseDTO {

    Booking booking;

    ResponseType responseType;

    String failureReason;

}

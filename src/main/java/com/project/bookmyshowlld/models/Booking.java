package com.project.bookmyshowlld.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{

    @OneToMany
    List<Payments> paymentsList;

    @ManyToOne
    Show show;

    LocalDateTime bookingDate;

    double price;

    // 1 : M
    // M : 1  , cancelled booking will also have showseat
    @ManyToMany
    List<ShowSeat> showSeatList;

    @ManyToOne
    User user;

    @Enumerated(EnumType.STRING)
    BookingStatus bookingStatus;
}

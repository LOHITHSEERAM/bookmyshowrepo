package com.project.bookmyshowlld.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel {

    int seatNumber;

    @ManyToOne
    SeatType seatType;

    int seatRow;

    int seatCol;
}

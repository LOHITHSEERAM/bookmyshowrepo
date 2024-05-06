package com.project.bookmyshowlld.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{

    @ManyToOne
    SeatType showSeatType;

    @ManyToOne
    Show show;

    Double seatPrice;
}

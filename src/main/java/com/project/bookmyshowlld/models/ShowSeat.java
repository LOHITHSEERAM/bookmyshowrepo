package com.project.bookmyshowlld.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
public class ShowSeat extends BaseModel {

    @ManyToOne
    Show show;

    @ManyToOne
    Seat seat;

    @Enumerated(EnumType.STRING)
    ShowSeatStatus status;

    private LocalDateTime blockedAt;

}

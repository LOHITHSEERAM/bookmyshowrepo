package com.project.bookmyshowlld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@Entity(name = "movie_show")
public class Show extends BaseModel{

    @ManyToOne
    Movie movie;

    LocalDateTime showStartTime;

    @OneToMany(mappedBy = "show")
    List<ShowSeat> showSeatsList;

    @OneToMany(mappedBy = "show")
    List<ShowSeatType> showSeatTypes;
}

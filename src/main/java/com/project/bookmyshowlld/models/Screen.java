package com.project.bookmyshowlld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.util.List;

@Entity
@Setter
@Getter
public class Screen extends BaseModel {

    String name;

    @OneToMany
    @JoinColumn(name="screen")
    List<Seat> seats;

}

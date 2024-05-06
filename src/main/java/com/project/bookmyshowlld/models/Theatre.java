package com.project.bookmyshowlld.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.util.List;

@Entity
@Setter
@Getter
public class Theatre extends BaseModel {

    String theatreName;

    String theatreAddress;

    @OneToMany
    @JoinColumn(name="theatre_id")
    List<Screen> screens;

    @ManyToOne
    Region region;

}

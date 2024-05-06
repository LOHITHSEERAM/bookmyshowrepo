package com.project.bookmyshowlld.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Region extends BaseModel{

    String name;

    @ManyToMany
    List<Movie> movies;
}

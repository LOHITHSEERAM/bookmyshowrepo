package com.project.bookmyshowlld.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.List;


@Entity
@Setter
@Getter
public class Movie extends BaseModel{

    String title;

    @JsonInclude
    @Transient
    List<String> genres;

    @Transient
    Duration duration;

    @JsonInclude
    @Transient
    List<String> actors;
}

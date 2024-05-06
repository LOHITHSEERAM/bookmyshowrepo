package com.project.bookmyshowlld.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name="app_user")
@Setter
@Getter
public class User extends BaseModel{

    String name;

    String email;

    @OneToMany(mappedBy = "user")
    List<Booking> bookings;
}

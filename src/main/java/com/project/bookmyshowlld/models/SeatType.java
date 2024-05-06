package com.project.bookmyshowlld.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class SeatType extends BaseModel{

    String seatTypeName;
}

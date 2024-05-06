package com.project.bookmyshowlld.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class BookingTicketRequestDTO {

    private Integer userId;

    private Integer showId;

    private List<Integer> showSeatIdList;

}

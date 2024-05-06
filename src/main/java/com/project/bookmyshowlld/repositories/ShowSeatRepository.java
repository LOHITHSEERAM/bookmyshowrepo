package com.project.bookmyshowlld.repositories;

import com.project.bookmyshowlld.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {

    public Optional<ShowSeat> findBySeatId(Integer seatId);
}

package com.assignment.betting.repository;

import com.assignment.betting.entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BetRepository extends JpaRepository<Bet, String> {
    List<Bet> findByEventId(String eventId);
}

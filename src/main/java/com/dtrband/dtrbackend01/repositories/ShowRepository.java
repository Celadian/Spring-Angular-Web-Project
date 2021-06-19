package com.dtrband.dtrbackend01.repositories;

import com.dtrband.dtrbackend01.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {
}

package com.dtrband.dtrbackend01.repositories;

import com.dtrband.dtrbackend01.models.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {
}

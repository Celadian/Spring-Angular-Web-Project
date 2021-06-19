package com.dtrband.dtrbackend01.repositories;

import com.dtrband.dtrbackend01.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {
}

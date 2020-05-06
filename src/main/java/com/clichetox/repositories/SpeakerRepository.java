package com.clichetox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clichetox.model.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}

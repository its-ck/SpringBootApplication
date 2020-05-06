package com.clichetox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clichetox.model.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}

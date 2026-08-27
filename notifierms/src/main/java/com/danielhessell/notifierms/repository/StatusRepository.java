package com.danielhessell.notifierms.repository;

import com.danielhessell.notifierms.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}

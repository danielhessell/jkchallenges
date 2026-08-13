package com.danielhessell.notifierms.repository;

import com.danielhessell.notifierms.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}

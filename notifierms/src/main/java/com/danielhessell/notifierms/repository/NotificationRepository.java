package com.danielhessell.notifierms.repository;

import com.danielhessell.notifierms.entity.Notification;
import com.danielhessell.notifierms.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndSendAtBefore(List<Status> status, LocalDateTime dateTime);
}

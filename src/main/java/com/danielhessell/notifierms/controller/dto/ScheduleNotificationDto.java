package com.danielhessell.notifierms.controller.dto;

import com.danielhessell.notifierms.entity.Channel;
import com.danielhessell.notifierms.entity.Notification;
import com.danielhessell.notifierms.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime sendAt,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
            sendAt,
            destination,
            message,
            channel.toChannel(),
            Status.Values.PENDING.toStatus()
        );
    }
}

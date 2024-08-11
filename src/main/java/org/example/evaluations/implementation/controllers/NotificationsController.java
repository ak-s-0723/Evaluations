package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.NotificationRequestDto;
import org.example.evaluations.implementation.models.Notification;
import org.example.evaluations.implementation.services.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationsController {

    @Autowired
    private INotificationService notificationService;

    @PostMapping("/notifications")
    public Notification sendNotification(@RequestBody NotificationRequestDto notificationRequest) {
       return notificationService.sendNotification(notificationRequest.getSender(),notificationRequest.getRecipient());
    }
}

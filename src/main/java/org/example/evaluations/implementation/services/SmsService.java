package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Content;
import org.example.evaluations.implementation.models.Notification;
import org.example.evaluations.implementation.models.NotificationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements INotificationService {

    @Autowired
    private Content content;

    private String message;

    @Override
    public Notification sendNotification(String sender, String recipient) {
        Notification notification = new Notification();
        notification.setMessage(content.getMessage());
        notification.setSender(sender);
        notification.setRecipient(recipient);
        notification.setNotificationType(NotificationType.SMS);
        return notification;
    }
}

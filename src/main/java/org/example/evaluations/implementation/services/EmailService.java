package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Content;
import org.example.evaluations.implementation.models.Notification;
import org.example.evaluations.implementation.models.NotificationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailService implements INotificationService {

    @Autowired
    private Content content;

    @Override
    public Notification sendNotification(String sender, String recipient) {
        Notification notification = new Notification();
        notification.setMessage(content.getMessage());
        notification.setSender(sender);
        notification.setRecipient(recipient);
        notification.setNotificationType(NotificationType.EMAIL);
        return notification;
    }
}

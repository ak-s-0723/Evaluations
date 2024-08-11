package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Content;
import org.example.evaluations.evaluation.models.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements INotificationService {

    @Autowired
    private Content content;

    @Override
    public Notification sendNotification(String sender, String recipient) {
        return null;
    }
}

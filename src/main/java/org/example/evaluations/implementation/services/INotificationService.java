package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Notification;

public interface INotificationService {

    Notification sendNotification(String sender, String recipient);
}

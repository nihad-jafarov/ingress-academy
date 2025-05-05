package com.ingress.factory;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) return null;

        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}
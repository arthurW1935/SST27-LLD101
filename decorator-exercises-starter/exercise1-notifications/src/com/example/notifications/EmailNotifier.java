package com.example.notifications;

public class EmailNotifier implements Notifier {
    private final String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void notify(String text) {
        System.out.println("[EMAIL -> " + email + "]: " + text);
    }
}

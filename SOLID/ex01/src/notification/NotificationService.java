package notification;

public class NotificationService {
    private final EmailClient emailClient;

    public NotificationService(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    public void notifyCustomer(String email, String message) {
        emailClient.send(email, message);
    }
}

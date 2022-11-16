package solid.openClosedPrinciple;

public class EmailNotification implements NotificationService {

    @Override
    public void sendMessage(String message) {
        //write email
        //use JavaMailSenderAPI
    }
}

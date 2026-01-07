package example06;

public class DipTest {
    public static void main(String[] args) {
        NotificationSender[] notificationSenders = new NotificationSender[]{
                new EmailNotificationSender(),
                new SmsNotificationSender()
        };
        for (NotificationSender notificationSender : notificationSenders) {
            NotificationService notificationService = new NotificationService(notificationSender);
            notificationService.notify("Hello World");
        }
    }
}
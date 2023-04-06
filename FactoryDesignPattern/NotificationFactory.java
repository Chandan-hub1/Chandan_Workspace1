package FactoryDesignPattern;

public class NotificationFactory {
    Notification notification;
    public Notification createNotification(String channel){
        if (channel==null || channel.isEmpty()){
            return null;
        }
        switch (channel){
            case "sms" :
                return new SMSNotification();
            case "email" :
                return new EmailNotification();
            case "push" :
                return new PushNotification();
            default:
                throw new IllegalArgumentException();
        }
    }
}

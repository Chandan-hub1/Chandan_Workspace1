package FactoryDesignPattern;

public class SMSNotification implements Notification{
    @Override
    public void notifiyUser() {
        System.out.println("SMS Notification");
    }
}

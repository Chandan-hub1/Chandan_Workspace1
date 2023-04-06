package FactoryDesignPattern;

public class PushNotification implements Notification{
    @Override
    public void notifiyUser() {
        System.out.println("Push Notification");
    }
}

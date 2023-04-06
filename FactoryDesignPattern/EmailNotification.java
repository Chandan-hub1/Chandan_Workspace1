package FactoryDesignPattern;

public class EmailNotification implements Notification{
    @Override
    public void notifiyUser() {
        System.out.println("EMail Notification");
    }
}

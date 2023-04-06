package FactoryDesignPattern;

//https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
public class MainClass {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification= notificationFactory.createNotification("sms");
        notification.notifiyUser();
        notification=notificationFactory.createNotification("push");
        notification.notifiyUser();
        notification=notificationFactory.createNotification("email");
        notification.notifiyUser();
    }
}

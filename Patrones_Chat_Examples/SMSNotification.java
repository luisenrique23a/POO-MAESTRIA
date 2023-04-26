public class SMSNotification implements NotificationService, Observer{
    public void notifyUser(String message) {
        String phoneNumber= UserSession.getUniqueInstance().getPhone();
        System.out.println ("Mandar SMS - " + phoneNumber + ": " + message);
    }

    @Override
    public void update(String message){
        notifyUser(message);
    }
}

public class PushNotification implements NotificationService, Observer{
    public void notifyUser(String message) {
        String device= UserSession.getUniqueInstance().getDeviceId();
        System.out.println("Mandar Push - "+ device +": "+ message);
    }

    public void update(String message){
        notifyUser(message);
    }
}

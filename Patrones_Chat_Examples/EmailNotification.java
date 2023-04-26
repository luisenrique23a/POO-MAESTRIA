public class EmailNotification implements NotificationService, Observer{
    public void notifyUser(String message) {
        String email= UserSession.getUniqueInstance().getEmail();
        System.out.println("Mandar EMAIL - "+ email +": "+ message);
    }

    public void update(String message){
        notifyUser(message);
    }
}
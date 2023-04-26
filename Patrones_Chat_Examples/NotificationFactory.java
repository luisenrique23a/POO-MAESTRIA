public class NotificationFactory {
    public NotificationService SendNotification (String service) {
        NotificationService concreteService;
        switch(service){
            case "sms":
                concreteService = new SMSNotification();
                break;
            case "push":
                concreteService = new PushNotification();
                break;
            case "email":
                concreteService = new EmailNotification();
                break;
                default:
                concreteService = null;
        }
        return concreteService;
    }
}

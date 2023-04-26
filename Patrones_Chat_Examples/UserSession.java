public class UserSession extends Subject {
    private String email;
    private String phone;

    private String deviceId;

    private String Password;

    //Singleton Section//

    private static UserSession uniqueInstance;
    private UserSession(){
    }
    public static UserSession getUniqueInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new UserSession();
        }
        return uniqueInstance;
    }

    //Singleton Section//

    public void setUser(String email,String phone,String deviceId,String password) {
        this.email=email;
        this.phone=phone;
        this.deviceId=deviceId;
        this.Password=password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String SetPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password=password;
        String message;
        message="PASSWORD CHANGED";
        notifySubscribers(message);
    }
}

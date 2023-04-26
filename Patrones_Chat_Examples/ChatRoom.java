import java.util.ArrayList;
import java.util.List;

public class ChatRoom extends Subject {
    private List<String> conversation = new ArrayList<>();

    public void writeMessage (String message){
        conversation.add(message);
        notifySubscribers(message);

    }


}

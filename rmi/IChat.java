import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Hashtable;

public interface IChat extends Remote {

    ArrayList<String> connect(IChatClient client, String username)
            throws RemoteException;

    void sendMessage(String username, String message)
            throws RemoteException;
}

class Chat implements IChat {

    private Hashtable<String, IChatClient> clients;
    private ArrayList<String> users;

    public Chat() {
        clients = new Hashtable<>();
        users = new ArrayList<>();
    }

    public ArrayList<String> connect(
            IChatClient client, String username) {

        users.add(username);
        clients.put(username, client);

        System.out.println(username + " connected");

        return users;
    }

    public void sendMessage(String username, String message) {

        try {
            IChatClient client = clients.get(username);

            if (client != null) {
                client.deliverMessage(message);
            } else {
                System.out.println("User not found: " + username);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public interface IChatClient extends Remote {

    void deliverMessage(String message) throws RemoteException;
}

class ChatClient1 extends UnicastRemoteObject implements IChatClient {

    public ChatClient1() throws RemoteException {
        super();
    }

    public void deliverMessage(String message) {
        System.out.println("Message received: " + message);
    }
}

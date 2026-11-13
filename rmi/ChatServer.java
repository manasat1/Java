import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ChatServer {

    public static void main(String[] args) {

        try {
            IChat chat = new Chat();

            IChat stub =
                (IChat) UnicastRemoteObject.exportObject(chat, 0);

            Registry registry = LocateRegistry.getRegistry();

            registry.rebind("chatService", stub);

            System.out.println("Chat server started successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

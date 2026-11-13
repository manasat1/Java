import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            Registry registry = LocateRegistry.getRegistry();

            IChat chat = (IChat) registry.lookup("chatService");

            IChatClient chatClient = new ChatClient1();

            ArrayList<String> users = chat.connect(chatClient, name);

            System.out.println("Connected users: " + users);

            while (true) {

                System.out.print("Enter message (type exit to quit): ");

                String message = scanner.nextLine();

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Chat closed.");
                    break;
                }

                System.out.print("Enter recipient username: ");
                String username = scanner.nextLine();

                chat.sendMessage(username, message);
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

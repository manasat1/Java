import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {

    public static void main(String[] args) {

        try {
            IMathRemote mathRemote = new MathRemote();

            IMathRemote stub =
                (IMathRemote) UnicastRemoteObject.exportObject(mathRemote, 0);

            Registry registry = LocateRegistry.getRegistry();

            registry.rebind("mr", stub);

            System.out.println("Object registered successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

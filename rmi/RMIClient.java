import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {

    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry();

            IMathRemote mathRemote =
                (IMathRemote) registry.lookup("mr");

            int result = mathRemote.sum(100, 200);

            System.out.println("Sum: " + result);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

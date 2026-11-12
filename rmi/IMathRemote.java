import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMathRemote extends Remote {

    int sum(int x, int y) throws RemoteException;
}

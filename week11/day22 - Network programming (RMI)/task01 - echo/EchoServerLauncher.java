import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by Alexander Worton on 20/12/2016.
 */
public class EchoServerLauncher {
    public static void main(String[] args) {
        try{
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            LocateRegistry.createRegistry(7);
            EchoServer server = new EchoServer();
            String registryAddress = "localhost";
            String registryUrl = "//" + registryAddress + "/";
            String serviceName = "echo";
            Naming.rebind(registryUrl + serviceName, server);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        catch(RemoteException e){
            e.printStackTrace();
        }
    }
}

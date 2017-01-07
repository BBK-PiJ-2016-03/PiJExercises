import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Created by Alexander Worton on 20/12/2016.
 */
public class EchoClient {

    private EchoService echoService;
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        EchoClient ec = new EchoClient();
        ec.run();
    }

    private void run(){
        System.out.println("Echo service");
        connectService("127.0.0.1", "7");
        String input;

        while((input = getInput()).toLowerCase() != "q"){
            if(echoService == null)
                break;
            executeInput(input);
        }
    }

    private void executeInput(String input){
        try {
            String receivedEcho = echoService.echo(input);
            System.out.println("Response: " + receivedEcho);
        }
        catch(RemoteException e){
            System.out.println("Remote Exception occurred");
        }
    }

    private String getInput(){
        System.out.print("> ");
        return sc.next();
    }

    private void connectService(String registryAddress, String port){
        System.out.println("Connecting...");
        try{
            connect(registryAddress, port);
        }
        catch(MalformedURLException e){
            System.out.println("Failure - URL Malformed");
        }
        catch(NotBoundException e){
            System.out.println("Failed to bind to server");
        }
        catch(RemoteException e){
            System.out.println("A remote exception occurred");
        }
    }

    private void connect(String registryAddress, String port) throws RemoteException, MalformedURLException, NotBoundException {
        Remote service = Naming.lookup("//" + registryAddress + ":"+port+"/echo");
        echoService = (EchoService) service;
        System.out.println("Connected");
    }
}

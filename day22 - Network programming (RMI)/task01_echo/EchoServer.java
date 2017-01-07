package task01_echo;

import task01_echo.EchoService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Alexander Worton on 20/12/2016.
 */
public class EchoServer extends UnicastRemoteObject implements EchoService {

    public EchoServer() throws RemoteException{
        //empty constructor declared to state the thrown exception
    }

    @Override
    public String echo(String s) throws RemoteException {
        System.out.println(String.format("Replied to some client saying: %s", s));
        return s;
    }
}

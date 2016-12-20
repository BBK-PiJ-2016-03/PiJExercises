import java.rmi.RemoteException;

/**
 * Created by Alexander Worton on 20/12/2016.
 */
public interface EchoService {
    /**
     * Returns the same string passed as a parameter
     * @param s a String
     * @return the same string passed as a parameter
     */
    public String echo(String s) throws RemoteException;
}

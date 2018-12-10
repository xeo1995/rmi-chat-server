package rmi;
 
import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * @author omar
 */
public interface ServiceInterface  extends Remote {
    
    public int sum(int a,int b) throws RemoteException;
    public String chat(String text) throws RemoteException;
    
   
}

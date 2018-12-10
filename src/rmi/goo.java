/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author omar
 */
public class goo {
    
    
     public static void main(String[] args) throws RemoteException, AlreadyBoundException
     
     
     {
      
          try {    LocateRegistry.createRegistry(1090);
                    String url = "rmi://127.0.0.1:1090/service";

         Service ser =  new Service();
        Naming.rebind(url, ser);
            System.out.println("********* Server Start *************");
         
        }catch(MalformedURLException e) {
            System.out.println("rmi.go.main() :"+e.getMessage());
        }
         
    
     }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

/**
 *
 * @author omar
 */
public class Service  extends UnicastRemoteObject implements ServiceInterface {
    
    public Service () throws RemoteException {
        super();
    }
    
    
    public int sum(int a , int b)  throws RemoteException {
        System.out.println("rmi.Service.sum()");
        return a+b;
    }

    public String chat(String text) throws RemoteException {
        System.out.println("[Client] : "+text);  
        System.out.print("[ME-Server] : ");
        Scanner scanner = new Scanner(System.in); 
        String input = scanner.nextLine();        
        
        return input;
    }

   
}

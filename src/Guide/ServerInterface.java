/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Guide;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Administrator
 */
public interface ServerInterface extends Remote{
    public String Turning(String s) throws RemoteException; 
} 


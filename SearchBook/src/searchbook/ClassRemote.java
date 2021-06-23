/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchbook;

import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class ClassRemote extends UnicastRemoteObject implements Interface
{
    ClassRemote()throws RemoteException
    {
        super();
    }
     public boolean SearchFile(String f_name) throws RemoteException
     {
        boolean result = false;
        File f = new File("D:/"+f_name);
        if(f.exists() && !f.isDirectory()) 
        { 
             result = true;
        }
        return result;
     }
}

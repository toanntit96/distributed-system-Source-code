/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class ClassCaculator extends UnicastRemoteObject implements InterfaceCaculator 
{
    ClassCaculator() throws RemoteException
    {
        super();
    }
    public int Add(int a, int b) throws RemoteException
    {
        return a+b;
    }
}

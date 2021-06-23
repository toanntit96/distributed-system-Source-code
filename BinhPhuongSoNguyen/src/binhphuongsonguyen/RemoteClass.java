/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binhphuongsonguyen;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author ASUS
 */
public class RemoteClass extends UnicastRemoteObject implements InterfaceRemote
{
    RemoteClass() throws RemoteException
    {
        super();
    }
    public int binhphuong(int a) throws RemoteException
    {
        return a*a;
    }
}

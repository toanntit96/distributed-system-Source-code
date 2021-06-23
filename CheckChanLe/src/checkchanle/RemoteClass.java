/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkchanle;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author ASUS
 */
public class RemoteClass extends UnicastRemoteObject implements Interface
{
    RemoteClass() throws RemoteException
    {
        super();
    }
    public String chk_chanLe(int a) throws RemoteException
    {
        if(a%2==0) return "Là số chẵn";
                else return "Là số lẻ";
    }
}

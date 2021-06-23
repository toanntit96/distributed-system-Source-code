/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ASUS
 */
public interface InterfaceCau1 extends Remote
{
    public int UCLN(int a, int b) throws RemoteException;
    public int BCNN(int a, int b) throws RemoteException;
}

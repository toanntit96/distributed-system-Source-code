/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ASUS
 */
public interface InterfaceCau2 extends Remote 
{
   public boolean soNguyenTo(int n) throws RemoteException;
}

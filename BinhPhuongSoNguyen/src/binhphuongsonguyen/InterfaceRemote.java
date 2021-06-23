/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binhphuongsonguyen;
import java.rmi.*;
/**
 *
 * @author ASUS
 */
public interface InterfaceRemote extends Remote
{
    public int binhphuong(int a) throws RemoteException;
}

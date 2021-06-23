/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkchanle;

import java.rmi.*;

/**
 *
 * @author ASUS
 */
public interface Interface extends Remote{
    public String chk_chanLe(int a) throws RemoteException;
}

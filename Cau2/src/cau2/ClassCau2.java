/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import static java.lang.Math.sqrt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class ClassCau2 extends UnicastRemoteObject implements InterfaceCau2 
{
    ClassCau2() throws RemoteException
    {
        super();
    }
    public boolean soNguyenTo(int n) throws RemoteException
    {
        if (n < 2) 
	{
		return false;
	}
	else if (n>2)
	{
		if (n % 2 == 0)  
		{
			return false;
		}
		for (int i = 3; i < sqrt((float)n); i += 2)  
		{
			if (n%i == 0) 
			{
				return false;
			}
		}
	}
	return true;
    }
    
}

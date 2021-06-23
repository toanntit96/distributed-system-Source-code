/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class ClassCau1 extends UnicastRemoteObject implements InterfaceCau1 
{
    ClassCau1() throws RemoteException
    {
        super();
    }
    public int UCLN(int a, int b) throws RemoteException
    {
        while ( a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    public int BCNN(int a, int b) throws RemoteException
    {
        if(a<=1)return b;
        if(b<=1)return a;
        int _a=a,_b=b;
        while(_a!=_b){
            if(_a>_b)_a-=_b;
            else _b-=_a;
        }
        return a*b/_a;
        /*int result = UCLN(a, b);
        return a * b / result;*/
    }
}

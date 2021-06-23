/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readnum;

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
    public String ReadNum(int num) throws RemoteException
     {
        String result = "";
        switch(num)
        {
            case 0: 
                result = "Không"; break;
            case 1: 
                result = "Một"; break;
            case 2: 
                result = "Hai"; break;
            case 3: 
                result = "Ba"; break;
            case 4: 
                result = "Bốn"; break;
            case 5: 
                result = "Năm"; break;
            case 6: 
                result = "Sáu"; break;
            case 7: 
                result = "Bảy"; break;
            case 8: 
                result = "Tám"; break;
            case 9: 
                result = "Chín"; break;
            default: result = "Không đọc được số này."; break;
        }
        return result;
     }
}

package com.tomy.designpattern.proxy.candymachinermi;

import com.tomy.designpattern.proxy.candymachine.IState;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICandyMachineRemote extends Remote
{
    String getLocation() throws RemoteException;
    int getCount() throws RemoteException;
    IState getCurrentState() throws RemoteException;
}

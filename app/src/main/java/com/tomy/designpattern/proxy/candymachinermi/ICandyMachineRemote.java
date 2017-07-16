package com.tomy.designpattern.proxy.candymachinermi;

import com.tomy.designpattern.proxy.candymachine.IState;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICandyMachineRemote extends Remote{
	public String  getLocation() throws RemoteException;
	public int getCount() throws RemoteException;
	public IState getstate() throws RemoteException;
}

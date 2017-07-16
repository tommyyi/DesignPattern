package com.tomy.designpattern.proxy.candymachine;

import com.tomy.designpattern.proxy.candymachinermi.ICandyMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CandyMachine extends UnicastRemoteObject implements ICandyMachineRemote
{

	IState mSoldOutIState;
	IState mOnReadyIState;
	IState mHasCoin;
	IState mSoldIState;
	IState mWinnerIState;
	private String location="";
	private IState mIState;
	private int count = 0;

	public CandyMachine(String location,int count) throws RemoteException{
		this.location=location;
		this.count = count;
		mSoldOutIState = new SoldOutState(this);
		mOnReadyIState = new OnReadyState(this);
		mHasCoin = new HasCoin(this);
		mSoldIState = new SoldState(this);
		mWinnerIState = new WinnerState(this);
		if (count > 0) {
			mIState = mOnReadyIState;
		} else {
			mIState = mSoldOutIState;
		}
	}
	public String getLocation()
	{
		return location;
	}
	public void setIState(IState IState) {
		this.mIState = IState;
	}

	public void insertCoin() {
		mIState.insertCoin();
	}

	public void returnCoin() {
		mIState.returnCoin();
	}

	public void turnCrank() {
		mIState.turnCrank();
		mIState.dispense();
	}

	void releaseCandy() {

		// TODO Auto-generated method stub
		if (count > 0) {
			count = count - 1;
			System.out.println("a candy rolling out!");
		}

	}

	public int getCount() {
		return count;
	}

	public void printstate() {
		mIState.printstate();
	}
	public IState getstate() {
		return mIState;
	}
}

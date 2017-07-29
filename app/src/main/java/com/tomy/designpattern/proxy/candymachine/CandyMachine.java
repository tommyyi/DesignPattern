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
    private String location = "";
    private IState mCurrentState;
    private int count = 0;

    public CandyMachine(String location, int count) throws RemoteException
    {
        this.location = location;
        this.count = count;
        mSoldOutIState = new SoldOutState(this);
        mOnReadyIState = new OnReadyState(this);
        mHasCoin = new HasCoin(this);
        mSoldIState = new SoldState(this);
        mWinnerIState = new WinnerState(this);
        if (count > 0)
        {
            mCurrentState = mOnReadyIState;
        }
        else
        {
            mCurrentState = mSoldOutIState;
        }
    }

    public String getLocation()
    {
        return location;
    }

    public void setCurrentState(IState currentState)
    {
        this.mCurrentState = currentState;
    }

    public void insertCoin()
    {
        mCurrentState.insertCoin();
    }

    public void returnCoin()
    {
        mCurrentState.returnCoin();
    }

    public void turnCrank()
    {
        mCurrentState.turnCrank();
        mCurrentState.dispense();
    }

    void releaseCandy()
    {
        if (count > 0)
        {
            count = count - 1;
            System.out.println("a candy rolling out!");
        }
    }

    public int getCount()
    {
        return count;
    }

    public void printstate()
    {
        mCurrentState.printCurrentState();
    }

    public IState getCurrentState()
    {
        return mCurrentState;
    }
}

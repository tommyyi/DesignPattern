package com.tomy.designpattern.proxy.candymachine;

public class OnReadyState implements IState
{
    private transient CandyMachine mCandyMachine;

    public OnReadyState(CandyMachine mCandyMachine)
    {
        this.mCandyMachine = mCandyMachine;
    }

    @Override
    public void insertCoin()
    {
        System.out.println("you have inserted a coin,next,please turn crank!");
        mCandyMachine.setCurrentState(mCandyMachine.mHasCoin);
    }

    @Override
    public void returnCoin()
    {
        // TODO Auto-generated method stub
        System.out.println("you haven't inserted a coin yet!");

    }

    @Override
    public void turnCrank()
    {
        // TODO Auto-generated method stub
        System.out.println("you turned,but you haven't inserted a coin!");

    }

    @Override
    public void dispense()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void printCurrentState()
    {
        // TODO Auto-generated method stub
        System.out.println("***OnReadyState***");

    }

    @Override
    public String getCurrentStateName()
    {
        // TODO Auto-generated method stub
        return "OnReadyState";
    }
}

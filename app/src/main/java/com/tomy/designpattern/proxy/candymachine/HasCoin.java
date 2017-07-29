package com.tomy.designpattern.proxy.candymachine;

import java.util.Random;

public class HasCoin implements IState
{
    private transient CandyMachine mCandyMachine;

    public HasCoin(CandyMachine mCandyMachine)
    {
        this.mCandyMachine = mCandyMachine;
    }

    @Override
    public void insertCoin()
    {
        System.out.println("you can't insert another coin!");
    }

    @Override
    public void returnCoin()
    {
        System.out.println("coin return!");
        mCandyMachine.setCurrentState(mCandyMachine.mOnReadyIState);
    }

    @Override
    public void turnCrank()
    {
        System.out.println("crank turn...!");
        Random ranwinner = new Random();
        int winner = ranwinner.nextInt(10);
        if (winner == 0)
        {
            mCandyMachine.setCurrentState(mCandyMachine.mWinnerIState);
        }
        else
        {
            mCandyMachine.setCurrentState(mCandyMachine.mSoldIState);
        }
    }

    @Override
    public void dispense()
    {
    }

    @Override
    public void printCurrentState()
    {
        System.out.println("***HasCoin***");
    }

    @Override
    public String getCurrentStateName()
    {
        return "HasCoin IState";
    }
}

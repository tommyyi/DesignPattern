package com.tomy.designpattern.proxy;

import com.tomy.designpattern.proxy.candymachinermi.ICandyMachineRemote;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class Monitor
{

    private ArrayList<ICandyMachineRemote> candyMachinelst;

    public Monitor()
    {
        candyMachinelst = new ArrayList<>();
    }

    public void addMachine(ICandyMachineRemote mCandyMachine)
    {
        candyMachinelst.add(mCandyMachine);
    }

    public void report()
    {
        ICandyMachineRemote mCandyMachine;
        for (int i = 0, len = candyMachinelst.size(); i < len; i++)
        {
            mCandyMachine = candyMachinelst.get(i);
            try
            {
                System.out.println("Machine Loc:" + mCandyMachine.getLocation());
                System.out.println("Machine Candy count:" + mCandyMachine.getCount());
                System.out.println("Machine IState:" + mCandyMachine.getCurrentState().getCurrentStateName());
            }
            catch (RemoteException e)
            {
                e.printStackTrace();
            }
        }
    }
}

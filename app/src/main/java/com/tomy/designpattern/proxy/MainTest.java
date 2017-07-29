package com.tomy.designpattern.proxy;

import com.tomy.designpattern.proxy.candymachinermi.ICandyMachineRemote;

import java.rmi.Naming;


public class MainTest
{
    public static void main(String[] args)
    {
        Monitor mMonitor = new Monitor();

        try
        {
            /*获取远端代理*/
            ICandyMachineRemote mCandyMachine = (ICandyMachineRemote) Naming.lookup("rmi://127.0.0.1:6602/test1");
            mMonitor.addMachine(mCandyMachine);

            /*获取远端代理*/
            mCandyMachine = (ICandyMachineRemote) Naming.lookup("rmi://127.0.0.1:6602/test2");
            mMonitor.addMachine(mCandyMachine);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        /*操作远端代理*/
        mMonitor.report();
    }
}

package com.tomy.designpattern.proxy.candymachinermi;

import java.rmi.Naming;


public class MainTest {

	public static void main(String[] args) {
		Monitor mMonitor = new Monitor();

		try {
			ICandyMachineRemote mCandyMachine = (ICandyMachineRemote) Naming
					.lookup("rmi://127.0.0.1:6602/test1");
			mMonitor.addMachine(mCandyMachine);
			mCandyMachine = (ICandyMachineRemote) Naming
					.lookup("rmi://127.0.0.1:6602/test2");
			mMonitor.addMachine(mCandyMachine);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mMonitor.report();
	}

}

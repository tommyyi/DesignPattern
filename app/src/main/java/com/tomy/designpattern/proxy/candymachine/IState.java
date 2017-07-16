package com.tomy.designpattern.proxy.candymachine;

import java.io.Serializable;

public interface IState extends Serializable{
	public void insertCoin();
	public void returnCoin();
	public void turnCrank();
	public void dispense();
	public void printstate();
	public String getstatename();
}

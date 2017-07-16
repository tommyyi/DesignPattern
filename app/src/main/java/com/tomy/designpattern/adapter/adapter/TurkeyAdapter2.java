package com.tomy.designpattern.adapter.adapter;


import com.tomy.designpattern.adapter.duck.IDuck;
import com.tomy.designpattern.adapter.turkey.WildTurkey;

public class TurkeyAdapter2 extends WildTurkey implements IDuck
{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		super.gobble();
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		super.fly();
		super.fly();
	}
}

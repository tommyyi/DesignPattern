package com.tomy.designpattern.adapter.adapter;


import com.tomy.designpattern.adapter.duck.IDuck;
import com.tomy.designpattern.adapter.turkey.ITurkey;

public class TurkeyAdapter implements IDuck
{
	private ITurkey mITurkey;
	
	public TurkeyAdapter(ITurkey ITurkey)
	{
		this.mITurkey = ITurkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		mITurkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			mITurkey.fly();
		}
	}

}

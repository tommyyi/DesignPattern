package com.tomy.designpattern.bridge.bridge;


import com.tomy.designpattern.bridge.control.IControl;

public abstract class TvControlabs {

	  IControl mIControl =null;
	public TvControlabs(IControl mIControl)
	{
		this.mIControl = mIControl;
	}
	
	public abstract void Onoff();
	public abstract void nextChannel();
	public abstract void preChannel();
	
	
}

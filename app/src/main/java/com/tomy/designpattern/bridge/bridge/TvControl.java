package com.tomy.designpattern.bridge.bridge;


import com.tomy.designpattern.bridge.control.IControl;

public class TvControl extends TvControlabs {
	private  int ch=0;
	private  boolean ison=false;
	
	public TvControl(IControl mIControl)
	{
		super(mIControl);
	}
	@Override
	public void Onoff() {
		// TODO Auto-generated method stub

		if(ison)
		{
			ison=false;
			mIControl.Off();
		}else{
			ison=true;
			mIControl.On();
		}
	
	}

	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub

		ch++;
		mIControl.setChannel(ch);
	
	}

	@Override
	public void preChannel() {
		// TODO Auto-generated method stub

		ch--;
		if(ch<0)
		{
			ch=200;
		}
		mIControl.setChannel(ch);
	
	}

}

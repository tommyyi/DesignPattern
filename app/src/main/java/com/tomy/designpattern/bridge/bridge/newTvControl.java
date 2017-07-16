package com.tomy.designpattern.bridge.bridge;


import com.tomy.designpattern.bridge.control.IControl;

public class newTvControl extends TvControlabs {
	private  int ch=0;
	private  boolean ison=false;
	private int prech=0;
	public newTvControl(IControl mIControl) {
		super(mIControl);
		// TODO Auto-generated constructor stub
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
		prech=ch;
		ch++;
		mIControl.setChannel(ch);
	
	}

	@Override
	public void preChannel() {
		// TODO Auto-generated method stub
		prech=ch;
		ch--;
		if(ch<0)
		{
			ch=200;
		}
		mIControl.setChannel(ch);
	
	}

	
	public void  setChannel(int nch)
	{
		prech=ch;
		ch=nch;
		mIControl.setChannel(ch);
		
	}
	public void   Back()
	{
		mIControl.setChannel(prech);
	}
}

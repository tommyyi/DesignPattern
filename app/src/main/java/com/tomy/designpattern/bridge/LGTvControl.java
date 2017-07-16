package com.tomy.designpattern.bridge;


import com.tomy.designpattern.bridge.control.LGControl;

public class LGTvControl extends LGControl implements ITvControl
{
	private static int ch=0;
	private static boolean ison=false;
	public void Onoff()
	{
		if(ison)
		{
			ison=false;
			super.Off();
		}else{
			ison=true;
			super.On();
		}
	}
	public void nextChannel()
	{
		ch++;
		super.setChannel(ch);
	}
	public void preChannel()
	{
		ch--;
		if(ch<0)
		{
			ch=200;
		}
		super.setChannel(ch);
	}

}

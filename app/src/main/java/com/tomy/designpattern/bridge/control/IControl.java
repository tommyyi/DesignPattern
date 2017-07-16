package com.tomy.designpattern.bridge.control;

public interface IControl
{
	
	public void On();
	public void Off();
	public void setChannel(int ch);
	public void setVolume(int vol);

}

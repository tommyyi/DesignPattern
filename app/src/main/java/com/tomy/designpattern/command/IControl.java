package com.tomy.designpattern.command;

public interface IControl
{

	public void onButton(int slot);

	public void offButton(int slot);
	
	public void undoButton();
}

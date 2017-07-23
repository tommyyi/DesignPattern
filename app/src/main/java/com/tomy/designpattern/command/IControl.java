package com.tomy.designpattern.command;

public interface IControl
{
	void onButton(int slot);
	void offButton(int slot);
	void undoButton();
}

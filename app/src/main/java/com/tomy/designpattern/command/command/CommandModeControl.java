package com.tomy.designpattern.command.command;

import com.tomy.designpattern.command.IControl;

import java.util.Stack;


public class CommandModeControl implements IControl
{
	private ICommand[] mOnICommands;
	private ICommand[] mOffICommands;
	private Stack<ICommand> stack=new Stack<ICommand>();
	public CommandModeControl()
	{
		mOnICommands =new ICommand[5];
		 mOffICommands =new ICommand[5];
		
		 ICommand noICommand =new NoCommand();
		 
		 for(int i = 0, len = mOnICommands.length; i<len; i++)
		 {
			 mOnICommands[i]= noICommand;
			 mOffICommands[i]= noICommand;
		 }
		 
	}
	
	public void setCommand(int slot, ICommand onICommand, ICommand offICommand)
	{
		mOnICommands[slot]= onICommand;
		 mOffICommands[slot]= offICommand;
		
	}

	@Override
	public void onButton(int slot) {
		
		mOnICommands[slot].execute();
		stack.push(mOnICommands[slot]);
	}

	@Override
	public void offButton(int slot) {
		
		mOffICommands[slot].execute();
		stack.push(mOffICommands[slot]);
	}

	@Override
	public void undoButton() {
		// TODO Auto-generated method stub
		stack.pop().undo();
	}

}

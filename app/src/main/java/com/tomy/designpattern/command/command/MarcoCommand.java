package com.tomy.designpattern.command.command;

public class MarcoCommand implements ICommand
{

	private ICommand[] mICommands;

	public MarcoCommand(ICommand[] ICommands) {
		this.mICommands = ICommands;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (int i = 0, len = mICommands.length; i < len; i++) {
			mICommands[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for (int i = mICommands.length - 1; i >= 0; i--) {
			mICommands[i].undo();
			
		}
	}

}

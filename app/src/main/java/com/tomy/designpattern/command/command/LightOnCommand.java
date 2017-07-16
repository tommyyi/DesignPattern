package com.tomy.designpattern.command.command;


import com.tomy.designpattern.command.device.Light;

public class LightOnCommand implements ICommand
{
	private Light light;
	
	public LightOnCommand(Light light)
	{
		this.light=light;
		
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.On();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.Off();
	}

}

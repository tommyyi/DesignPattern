package com.tomy.designpattern.command.command;


import com.tomy.designpattern.command.device.Stereo;

public class StereoOffCommand implements ICommand
{
	private Stereo setreo;
	public StereoOffCommand(Stereo setreo)
	{
		this.setreo=setreo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		setreo.Off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		setreo.On();
		setreo.SetCd();
	}

}


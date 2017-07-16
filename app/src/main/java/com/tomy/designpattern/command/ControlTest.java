package com.tomy.designpattern.command;


import com.tomy.designpattern.command.device.Light;
import com.tomy.designpattern.command.device.Stereo;

public class ControlTest {
	public static void main(String[] args) {
		IControl ctl;
		Light light = new Light("Bedroom");
		Stereo stereo = new Stereo();
		ctl = new TraditionControl(light, stereo);

		ctl.onButton(0);
		ctl.offButton(0);
		ctl.onButton(1);
		ctl.onButton(2);
		ctl.offButton(2);

		ctl.offButton(1);
	}
}

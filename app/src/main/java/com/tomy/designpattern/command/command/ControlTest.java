package com.tomy.designpattern.command.command;


import com.tomy.designpattern.command.device.Light;
import com.tomy.designpattern.command.device.Stereo;

public class ControlTest
{
    public static void main(String[] args)
    {
        /*初始化设备*/
        Light bedroomLight = new Light("BedRoom");
        Light kitchenLight = new Light("Kitch");
        Stereo stereo = new Stereo();

        /*初始化灯光命令*/
        ICommand bedroomLightOn = new LightOnCommand(bedroomLight);
        ICommand bedroomLightOff = new LightOffCommand(bedroomLight);
        ICommand kitchenLightOn = new LightOnCommand(kitchenLight);
        ICommand kitchenLightOff = new LightOffCommand(kitchenLight);

        /*初始化宏命令*/
        ICommand onMarco, offMarco;
        ICommand[] onCommands = {bedroomLightOn, kitchenLightOn};
        ICommand[] offCommands = {bedroomLightOff, kitchenLightOff};
        onMarco = new MarcoCommand(onCommands);
        offMarco = new MarcoCommand(offCommands);

        /*初始化音响命令*/
        ICommand stereoOn = new StereoOnCommand(stereo);
        ICommand stereoOff = new StereoOffCommand(stereo);
        ICommand stereoAddVol = new StereoAddVolCommand(stereo);
        ICommand stereoSubVol = new StereoSubVolCommand(stereo);

        /*将命令设置到对应的按钮*/
        CommandModeControl control = new CommandModeControl();
        control.setCommand(0, bedroomLightOn, bedroomLightOff);
        control.setCommand(1, kitchenLightOn, kitchenLightOff);
        control.setCommand(2, stereoOn, stereoOff);
        control.setCommand(3, stereoAddVol, stereoSubVol);
        control.setCommand(4, onMarco, offMarco);

        /*操作按钮*/
        control.onButton(0);
        control.undoButton();
        //control.offButton(0);
        control.onButton(1);
        control.offButton(1);
        control.onButton(2);
        control.onButton(3);

        control.offButton(3);
        control.undoButton();
        control.offButton(2);
        control.undoButton();
        control.onButton(4);
        control.offButton(4);
    }
}

package chaoyue.designPattert.command;

import chaoyue.designPattert.command.command.LightOffCommand;
import chaoyue.designPattert.command.command.LightOnCommand;
import chaoyue.designPattert.command.command.StereoOffCommand;
import chaoyue.designPattert.command.command.StereoOnWithCDCommand;
import chaoyue.designPattert.command.invoker.Light;
import chaoyue.designPattert.command.invoker.Stereo;

/**
 * 遥控器命令模式demo
 */

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light("living room");
    Light kitchenLight = new Light("kitchen");
    Stereo stereo = new Stereo("living room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

    StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
    remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    // 没有添加 所以默认为 do noting
    remoteControl.onButtonWasPushed(3);
    remoteControl.offButtonWasPushed(3);
  }
}

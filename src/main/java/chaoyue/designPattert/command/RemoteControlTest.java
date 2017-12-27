package chaoyue.designPattert.command;

import chaoyue.designPattert.command.command.LightOnCommand;
import chaoyue.designPattert.command.invoker.Light;

/**
 * 命令模式 简单 demo
 * simpleReportControl不需要知道command的具体内容 只要执行具体的execute方法就ok了
 */

public class RemoteControlTest {
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    remote.setCommand(lightOn);
    remote.buttonWasPressed();
  }
}

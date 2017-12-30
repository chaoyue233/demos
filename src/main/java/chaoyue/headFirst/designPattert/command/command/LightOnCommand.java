package chaoyue.headFirst.designPattert.command.command;

import chaoyue.headFirst.designPattert.command.invoker.Light;

public class LightOnCommand implements Command {
  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }
}

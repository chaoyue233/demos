package chaoyue.designPattert.command.command;

import chaoyue.designPattert.command.invoker.Light;

public class LightOnCommand implements Command {
  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }
}

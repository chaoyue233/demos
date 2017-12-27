package chaoyue.designPattert.command.command;

import chaoyue.designPattert.command.invoker.Light;

public class LightOffCommand implements Command {
  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}

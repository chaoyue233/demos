package chaoyue.headFirst.designPattert.command.command;

import chaoyue.headFirst.designPattert.command.invoker.Light;

public class LightOffCommand implements Command {
  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}

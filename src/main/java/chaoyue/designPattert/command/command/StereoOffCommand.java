package chaoyue.designPattert.command.command;

import chaoyue.designPattert.command.invoker.Stereo;

public class StereoOffCommand implements Command {
  private Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.off();
  }
}

package chaoyue.designPattert.command.command;

import chaoyue.designPattert.command.invoker.Stereo;

public class StereoOnWithCDCommand implements Command {
  private Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.on();
    stereo.setCd();
    stereo.setVolume(12);
  }
}

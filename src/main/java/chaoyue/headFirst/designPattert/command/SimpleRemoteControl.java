package chaoyue.headFirst.designPattert.command;

import chaoyue.headFirst.designPattert.command.command.Command;

public class SimpleRemoteControl {
  Command slot;

  public SimpleRemoteControl() {
  }

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}

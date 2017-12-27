package chaoyue.designPattert.command;

import chaoyue.designPattert.command.command.Command;

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

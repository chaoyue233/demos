package chaoyue.designPattert.command.command;

public class NoCommand implements Command {
  public void execute() {
    System.out.println("do nothing");
  }
}

package chaoyue.designPattert.status;

public class HasQuarterState implements State {
  GumballMachine gumballMachine;

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("you can't insert another quarter");
  }

  public void ejectQuarter() {
    System.out.println("quarter ejected");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  public void turnCrank() {
    System.out.println("you turned...");
    gumballMachine.setState(gumballMachine.getSoldState());
  }

  public void dispense() {
    System.out.println("no gumball dispensed");
  }
}

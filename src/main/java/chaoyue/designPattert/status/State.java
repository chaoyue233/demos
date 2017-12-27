package chaoyue.designPattert.status;

public interface State {
  void insertQuarter();

  void ejectQuarter();

  void turnCrank();

  void dispense();
}

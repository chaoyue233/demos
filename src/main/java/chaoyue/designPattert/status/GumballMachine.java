package chaoyue.designPattert.status;

/**
 * 状态模式demo 抽象出具体的状态 并将动作委托到代表当前状态的对象
 */
public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  // 默认状态为没有糖果
  State state = soldOutState;
  int count = 0;

  public GumballMachine(int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldOutState(this);
    this.count = numberGumballs;
    // 如果剩余糖果数量大于0 则状态置为没有投币
    if (numberGumballs > 0) {
      state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  void setState(State state) {
    this.state = state;
  }

  void releaseBall() {
    System.out.println("a gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }
}

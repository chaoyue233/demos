package chaoyue.headFirst.designPattert.decorate;

public class B extends A {
  A a;

  public B(A a) {
    this.a = a;
  }

  @Override
  public int add() {
    return a.add() + 1;
  }
}

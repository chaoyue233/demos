package chaoyue.headFirst.designPattert.decorate;

public class Test {
  public static void main(String[] args) {
    A a = new A();
    A b = new B(a);
    System.out.println(b.add());
    b = new B(b);
    System.out.println(b.add());
  }
}

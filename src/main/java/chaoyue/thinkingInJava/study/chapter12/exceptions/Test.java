package chaoyue.thinkingInJava.study.chapter12.exceptions;

/**
 * finally 理论上再任何情况下都会执行
 * 只有一种方法可以阻止finally方法的执行 就是 System.exit()
 */
public class Test {

  public static void main(String[] args) {
    test1();
  }

  private static int test1() {
    try {
      int i = 1 / 0;
      return i;
    } catch (Exception e) {
      System.out.println("test1 catch");
      System.exit(0);
      return 1;
    } finally {
      System.out.println("test1 finally");
      return 1;
    }
  }
}

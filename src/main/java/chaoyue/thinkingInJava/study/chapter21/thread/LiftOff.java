package chaoyue.thinkingInJava.study.chapter21.thread;

/**
 * 简单多线程demo 通过实现Runnable接口来穿件多线程
 */
public class LiftOff implements Runnable {
  protected int countDown = 10;
  private static int taskCount = 0;
  private final int id = taskCount++;

  public LiftOff() {
  }

  public LiftOff(int countDown) {
    this.countDown = countDown;
  }

  public String status() {
    return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";
  }

  // run方法内为具体的逻辑
  public void run() {
    while (countDown-- > 0) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(status());
      Thread.yield();
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      // 使用Thread类来触发run方法中的逻辑 不可以直接调用run方法
      Thread t = new Thread(new LiftOff());
      t.start();
    }
    System.out.println("Waiting for LiftOff");
  }
}

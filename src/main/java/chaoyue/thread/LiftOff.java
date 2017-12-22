package chaoyue.thread;

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
    for (int i = 0; i < 1; i++) {
      Thread t = new Thread(new LiftOff());
      t.start();
    }
    System.out.println("Waiting for LiftOff");
  }
}

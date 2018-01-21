package chaoyue.thinkingInJava.study.chapter21.thread;

/**
 * join 使用demo 使用join可以打断其他线程的执行并开始执行当前线程
 */
class Sleeper extends Thread {
  private int duration;

  public Sleeper(String name, int duration) {
    super(name);
    this.duration = duration;
    start();
  }

  public void run() {
    try {
      sleep(duration);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(getName() + " has awakened");
  }
}


class Joiner extends Thread {
  private Sleeper sleeper;

  public Joiner(String name, Sleeper sleeper) {
    super(name);
    this.sleeper = sleeper;
    start();
  }

  public void run() {
    try {
      sleeper.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(getName() + "join completed");
  }
}

public class Joining {
  public static void main(String[] args) {
    Sleeper sleeper = new Sleeper("chaoyue", 20000);
    Joiner joiner = new Joiner("Roy", sleeper);
    sleeper.interrupt();
  }
}

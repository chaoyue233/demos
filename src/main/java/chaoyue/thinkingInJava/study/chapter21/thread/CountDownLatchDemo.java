package chaoyue.thinkingInJava.study.chapter21.thread;


import java.util.Random;
import java.util.concurrent.*;

class TaskProtion implements Runnable {
  private static int counter = 0;
  private final int id = counter++;
  private static Random random = new Random(47);
  private final CountDownLatch countDownLatch;

  public TaskProtion(CountDownLatch countDownLatch) {
    this.countDownLatch = countDownLatch;
  }

  @Override
  public void run() {
    try {
      doWork();
      countDownLatch.countDown();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

  public void doWork() throws InterruptedException {
    TimeUnit.MILLISECONDS.sleep(random.nextInt(2000));
    System.out.println(this + " completed");
  }

  @Override
  public String toString() {
    return "TaskProtion{" +
        "id=" + id +
        '}';
  }
}

class WaitingTask implements Runnable {
  private static int counter = 0;
  private final int id = counter++;
  private final CountDownLatch countDownLatch;

  public WaitingTask(CountDownLatch countDownLatch) {
    this.countDownLatch = countDownLatch;
  }

  @Override
  public void run() {
    try {
      countDownLatch.await();
      System.out.println("latch barrier passed for " + this);
    } catch (InterruptedException e) {
      e.printStackTrace();
      System.out.println(this + " interrupted");
    }
  }

  @Override
  public String toString() {
    return "WaitingTask{" +
        "id=" + id +
        '}';
  }
}


/**
 * countDownLatch例子 使用countDownLatch可以等待其他线程完成后再继续执行其他操作
 */
public class CountDownLatchDemo {
  static final int SIZE = 100;

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newCachedThreadPool();
    // 需要管理的线程必须处于同一个CountDownLatch对象下
    CountDownLatch countDownLatch = new CountDownLatch(SIZE);
    for (int i = 0; i < 10; i++) {
      executorService.execute(new WaitingTask(countDownLatch));
    }
    for (int i = 0; i < SIZE; i++) {
      executorService.execute(new TaskProtion(countDownLatch));
    }
    System.out.println("launched all tasks");
    executorService.shutdown();
  }
}

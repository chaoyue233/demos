package chaoyue.thread;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {
  public void run() {
    while (true) {
      try {
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(Thread.currentThread() + " " + this);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    for (int i = 0; i < 10; i++) {
      Thread daemon = new Thread(new SimpleDaemons());
      // 设置线程为当前main线程的后台线程 main线程结束同时kill当前main下的其他线程
      daemon.setDaemon(true);
      daemon.start();
    }
    System.out.println("All daemons started");
    TimeUnit.MILLISECONDS.sleep(2000);
  }
}

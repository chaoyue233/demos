package chaoyue.thinkingInJava.study.chapter21.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

class House implements Runnable {
  private static int counter = 0;
  private final int id = counter++;
  private int strides = 0;
  private static Random random = new Random(47);
  private CyclicBarrier cyclicBarrier;

  public House(CyclicBarrier cyclicBarrier) {
    this.cyclicBarrier = cyclicBarrier;
  }

  public synchronized int getStrides() {
    return strides;
  }

  @Override
  public void run() {
    while (!Thread.interrupted()) {
      synchronized (this) {
        strides += random.nextInt(3);
      }
      try {
        cyclicBarrier.await();
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (BrokenBarrierException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public String toString() {
    return "House{" +
        "id=" + id +
        '}';
  }

  public String tracks() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < getStrides(); i++) {
      s.append("*");
    }
    s.append(id);
    return s.toString();
  }
}

public class CyclicBarrierDemo {
  static final int FINISH_LINE = 75;
  private List<House> houres = new ArrayList<>();
  private ExecutorService executorService = Executors.newCachedThreadPool();
  private CyclicBarrier cyclicBarrier;

  public CyclicBarrierDemo(int nHourses, final int pause) {
    cyclicBarrier = new CyclicBarrier(nHourses, new Runnable() {
      @Override
      public void run() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < FINISH_LINE; i++) {
          s.append("=");
        }
        System.out.println(s);
        for (House house : houres) {
          System.out.println(house.tracks());
        }
        for (House house : houres) {
          if (house.getStrides() >= FINISH_LINE) {
            System.out.println(house + " won!!!!");
            executorService.shutdown();
            return;
          }
        }
        try {
          TimeUnit.MILLISECONDS.sleep(pause);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    for (int i = 0; i < nHourses; i++) {
      House house = new House(cyclicBarrier);
      houres.add(house);
      executorService.execute(house);
    }
  }

  public static void main(String[] args) {
    int nHourese = 7;
    int pause = 200;
    new CyclicBarrierDemo(nHourese, pause);
  }
}

package chaoyue.thinkingInJava.study.chapter21.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用Executors 来管理简单的线程池
 */
public class CachedThreadPool {
  public static void main(String[] args) {
    // cachedThreadPool 会为每个任务都创建一个线程
//    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//    for (int i = 0; i < 5; i++) {
//      cachedThreadPool.execute(new LiftOff());
//    }
//    cachedThreadPool.shutdown();
    // fixedThreadPool 会创建有线程数量限制的线程池
//    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
//    for (int i = 0; i < 5; i++) {
//      fixedThreadPool.execute(new LiftOff());
//    }
//    fixedThreadPool.shutdown();
    // singleThreadExecutor 即为线程数量为1的fixedThreadPool
    ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    for(int i=0;i<5;i++){
      singleThreadExecutor.execute(new LiftOff());
    }
    singleThreadExecutor.shutdown();
  }
}

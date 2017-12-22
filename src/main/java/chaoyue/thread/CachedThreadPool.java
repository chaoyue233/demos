package chaoyue.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
  public static void main(String[] args) {
//    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//    for (int i = 0; i < 5; i++) {
//      cachedThreadPool.execute(new LiftOff());
//    }
//    cachedThreadPool.shutdown();
//    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
//    for (int i = 0; i < 5; i++) {
//      fixedThreadPool.execute(new LiftOff());
//    }
//    fixedThreadPool.shutdown();
    ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    for(int i=0;i<5;i++){
      singleThreadExecutor.execute(new LiftOff());
    }
    singleThreadExecutor.shutdown();
  }
}

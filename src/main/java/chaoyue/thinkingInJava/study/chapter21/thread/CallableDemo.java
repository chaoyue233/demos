package chaoyue.thinkingInJava.study.chapter21.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Callable<T> 中指定的类型必须call()方法返回的类型一致 current包
 */
class TaskWithResult implements Callable<String> {
  private int id;

  public TaskWithResult(int id) {
    this.id = id;
  }

  public String call() throws Exception {
    Thread.sleep(1000);
    return "result of TaskWithResult  " + id;
  }
}

/**
 * 使用callable接口来实现多线程
 */
public class CallableDemo {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newCachedThreadPool();
    List<Future<String>> results = new ArrayList<Future<String>>();
    for (int i = 0; i < 10; i++) {
      // 使用submit()方法来触发call中的逻辑 返回Future对象来获取执行状态
      results.add(executorService.submit(new TaskWithResult(i+233)));
    }
    for (Future<String> future : results) {
      try {
        // 使用future.get()方法可以获取call()方法所一定的返回值 get()会阻塞至执行完成才返回
        System.out.println("future.get() " +future.get());
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (ExecutionException e) {
        e.printStackTrace();
      } finally {
        executorService.shutdown();
      }
    }
  }
}

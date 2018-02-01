package chaoyue.interviewSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题目 只使用一个辅助队列给另外一个队列排序
 * 使用List模拟队列操作
 */

public class QueueSort {
  private static ArrayList<Integer> sortedQueue = new ArrayList<>();

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(1);
    list.add(2);
    list.add(5);
    list.add(4);

    while (list.size() > 0) {
      System.out.println("original List : " + list);
      list = sortQueue(list);
    }
  }


  private static List<Integer> sortQueue(List<Integer> queue) {
    Integer element = queue.get(0);
    if (sortedQueue.size() == 0) {
      sortedQueue.add(element);
      queue.remove(0);
    } else {
      if (element <= sortedQueue.get(0)) {
        sortedQueue.add(0, element);
        queue.remove(0);
      } else {
        if (element < sortedQueue.get(sortedQueue.size() - 1)) {
          while (sortedQueue.get(sortedQueue.size() - 1) > element) {
            queue.add(sortedQueue.get(sortedQueue.size() - 1));
            sortedQueue.remove(sortedQueue.size() - 1);
          }
        }
        sortedQueue.add(sortedQueue.size(), element);
        queue.remove(0);
      }

    }
    System.out.println("sorted List : " + sortedQueue);
    return queue;
  }


}

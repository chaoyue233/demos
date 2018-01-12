package chaoyue.thinkingInJava.study.chapter17.containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReadOnly {
  static Collection<String> date = new ArrayList<>();

  public static void main(String[] args) {
    // 创建只读容器
    Collection<String> c = Collections.unmodifiableCollection(new ArrayList<String>());
    c.add("test"); // UnsupportedOperationException 运行时异常
    // 创建同步容器
    Collection<String> d = Collections.synchronizedCollection(new ArrayList<String>());
  }
}

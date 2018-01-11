package chaoyue.thinkingInJava.study.chapter15.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMethods {
  private <T> void f(T x) {
    System.out.println(x.getClass().getName());
  }

  @SafeVarargs
  private final <T> List<T> makeList(T... args) {
    List<T> resultList = new ArrayList<>();
    Collections.addAll(resultList, args);
    return resultList;
  }

  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    String name = "chaoyue";
    int num = 233;
    TwoTuple<String, Integer> twoTuple = new TwoTuple<>("chaoyue", 233);
    gm.f(name);
    gm.f(num);
    gm.f(twoTuple);

    List list = gm.makeList(name, num, twoTuple);
    System.out.println(list);
  }
}

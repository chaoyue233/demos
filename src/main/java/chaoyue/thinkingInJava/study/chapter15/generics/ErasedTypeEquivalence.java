package chaoyue.thinkingInJava.study.chapter15.generics;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
  public static void main(String[] args) throws IllegalAccessException, InstantiationException {
    Class c1 = new ArrayList<Integer>().getClass();
    Class c2 = new ArrayList<String>().getClass();
    Object a1 = c1.newInstance();
    Object a2 = c2.newInstance();

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c1 == c2);
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a1 == a2);
  }
}

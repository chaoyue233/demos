package chaoyue.thinkingInJava.study.chapter17.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress {
  private String s;

  public StringAddress(String s) {
    this.s = s;
  }

  @Override
  public String toString() {
    return "StringAddress{" +
        "s='" + s + '\'' +
        '}';
  }
}

public class FillingLists {
  public static void main(String[] args) {
    List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("hello")));
    System.out.println(list);
    Collections.fill(list, new StringAddress("world"));
    System.out.println(list);
  }
}

package chaoyue.thinkingInJava.study.chapter17.containers;

import java.util.Objects;

public class Groundhog2 extends Groundhog{
  protected int number;

  public Groundhog2(int number) {
    super(number);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Groundhog2 that = (Groundhog2) o;
    return number == that.number;
  }

  @Override
  public int hashCode() {

    return Objects.hash(number);
  }

  @Override
  public String toString() {
    return "Groundhog2{" +
        "number=" + number +
        '}';
  }
}

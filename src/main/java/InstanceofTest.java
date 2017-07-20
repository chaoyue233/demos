import java.util.ArrayList;
import java.util.List;

/**
 * Created by chaoyue on 2017/7/20.
 */
public class InstanceofTest {
  public static void main(String[] args) {
    System.out.println("test" instanceof String);
    Object testList = new ArrayList();
    System.out.println(testList instanceof String);
  }

}

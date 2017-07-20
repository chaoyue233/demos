/**
 * Created by chaoyue on 2017/7/20
 * 相当于给循环打一个标记，可以使用break 和 continue 语句对标记过的循环进行操作
 */
public class MarkTest {
  public static void main(String[] args) {
    mark1:
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("i: " + i + " j: " + j);
        if (j > 3) {
//          break;
          continue mark1;
        }
      }
    }
  }
}

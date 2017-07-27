/**
 * Created by chaoyue on 2017/7/20.
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
    System.getProperties().list(System.out);
    System.out.println("####userName " + System.getProperty("user.name"));
    System.out.println("####libraryPath " + System.getProperty("java.library.path"));
  }
}

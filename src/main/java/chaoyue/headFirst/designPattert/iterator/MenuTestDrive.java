package chaoyue.headFirst.designPattert.iterator;

public class MenuTestDrive {
  public static void main(String[] args) {
    DinnerMenu dinnerMenu = new DinnerMenu();
    Iterator iterator = dinnerMenu.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}

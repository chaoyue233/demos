package chaoyue.headFirst.designPattert.iterator;

import java.awt.*;

public class DinnerMenu {
  static final int MAX_ITEMS = 6;
  private MenuItem[] menuItems;

  public Iterator iterator() {
    return new DinerMenuIterator(menuItems);
  }
}

package chaoyue.designPattert.iterator;

import java.awt.*;

public class DinerMenuIterator implements Iterator {
  MenuItem[] items;
  int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  public boolean hasNext() {
    if (position >= items.length || items[position] == null) {
      return false;
    }
    return true;
  }

  public Object next() {
    MenuItem menuItem = items[position];
    position = position + 1;
    return menuItem;
  }
}

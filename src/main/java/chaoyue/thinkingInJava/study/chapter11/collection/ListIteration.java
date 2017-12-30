package chaoyue.thinkingInJava.study.chapter11.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("chaoyue");
        list.add("roy");
        ListIterator listIterator = list.listIterator();
        // 顺序
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        // 倒序
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}

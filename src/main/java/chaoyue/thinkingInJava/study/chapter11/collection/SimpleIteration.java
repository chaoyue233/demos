package chaoyue.thinkingInJava.study.chapter11.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("chaoyue");
        list.add("roy");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }


}

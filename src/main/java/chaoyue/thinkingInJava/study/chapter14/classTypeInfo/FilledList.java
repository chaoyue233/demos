package chaoyue.thinkingInJava.study.chapter14.classTypeInfo;

import java.util.ArrayList;
import java.util.List;

class CountInteger{
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }
    public List<T> create(int nElements){
        List<T> result = new ArrayList<>();
        for(int i = 0 ;i<nElements;i++){
            try {
                // 使用Class.newInstance() 要求原始类必须带有默认构造器
                result.add(type.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountInteger> fl = new FilledList<>(CountInteger.class);
        System.out.println(fl.create(15));
    }
}

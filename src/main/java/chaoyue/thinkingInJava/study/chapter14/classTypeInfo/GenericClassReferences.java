package chaoyue.thinkingInJava.study.chapter14.classTypeInfo;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<?> intClass1 = intClass;
        intClass1 = double.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
        // 编译校验无法通过
        //genericIntClass = double.class;
        // 与多态不一样 这样并无法编译通过
        //Class<Number> genericNumberClass = int.class;
        Class<? extends Number> genericNumberClass = int.class;

    }
}

package chaoyue.thinkingInJava.study.chapter15.generics;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<String> h3= new Holder3<>("test");
        System.out.println(h3.getA());
    }
}

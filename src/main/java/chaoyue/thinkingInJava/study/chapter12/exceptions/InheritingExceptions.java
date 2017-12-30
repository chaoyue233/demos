package chaoyue.thinkingInJava.study.chapter12.exceptions;

public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("throw simple exception from f()");
        throw new SimpleException("emmmmmm ");
    }

    public static void main(String[] args) {
        InheritingExceptions inheritingExceptions = new InheritingExceptions();
        try {
            inheritingExceptions.f();
        } catch (SimpleException e) {
            System.out.println(e.getMessage());
            System.out.println("catch it");
        }
    }
}

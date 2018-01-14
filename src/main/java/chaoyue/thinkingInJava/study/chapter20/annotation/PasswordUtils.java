package chaoyue.thinkingInJava.study.chapter20.annotation;

public class PasswordUtils {
    @UseCase(id = 1, description = "desc01")
    public void f1() {
        System.out.println("f1()");
    }

    @UseCase(id = 2)
    public void f2() {
        System.out.println("f2()");
    }

    @UseCase(id = 3)
    private void f3() {
        System.out.println("f3()");
    }

    public void f4() {

    }

    private void f5() {

    }

}

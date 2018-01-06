package chaoyue.thinkingInJava.study.chapter14.classTypeInfo;

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;

    SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("simpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    private static void consumer(Interface face){
        face.doSomething();
        face.somethingElse("chaoyue");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }


}

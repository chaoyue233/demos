package chaoyue.thinkingInJava.study.chapter14.classTypeInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(String.format("*** proxy: %s , method: %s , args: %s ", proxy.getClass(), method, Arrays.toString(args)));
        if (args != null) {
            for (Object arg : args) {
                System.out.println(" " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy {
    private static void consumer(Interface face) {
        face.doSomething();
        face.somethingElse("Roy");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);
        // 插入代理 再次调用
        ClassLoader classLoader = Interface.class.getClassLoader();
        Class<?>[] in = new Class[]{Interface.class};
        InvocationHandler handler = new DynamicProxyHandler(realObject);
        Interface proxy = (Interface) Proxy.newProxyInstance(classLoader, in, handler);
        consumer(proxy);
    }
}

package chaoyue.thinkingInJava.study.chapter14.classTypeInfo;

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
    public static void f(){}
}

/**
 * 类只在需要的时候才会初始化，不会一开始全部都初始化
 */

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("after creating Candy");
        try {
            Class.forName("chaoyue.thinkingInJava.study.chapter14.classTypeInfo.Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("after class.forName(Gum)");
        Cookie.f();
        System.out.println("After creating Cookie");
    }
}

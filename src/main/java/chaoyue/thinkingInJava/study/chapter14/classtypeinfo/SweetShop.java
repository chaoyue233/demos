package chaoyue.thinkingInJava.study.chapter14.classtypeinfo;

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("after creating Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("after class.forName(Gum)");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}

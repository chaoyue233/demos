package chaoyue.thinkingInJava.study.chapter14.classTypeInfo.toys;
import java.util.Date;

interface HasBatteries {
}

interface WaterProof {
}

interface Shoots {
}

class Toy {
    public Toy() {
    }

    Toy(int i) {
    }
}

class ToyFactory extends Toy implements HasBatteries, WaterProof, Shoots {
    public ToyFactory(int i) {
        super(i);
    }
}

/**
 * 可以在运行时通过Class对象获取当前类的信息
 */

public class ToyTest {
    private static void printInfo(Class cc) {
        System.out.println(String.format("ClassName: %s , isInterface: %s , SimpleName: %s , CanonicalName: %s",
                cc.getName(), cc.isInterface(), cc.getSimpleName(), cc.getCanonicalName()));
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("chaoyue.thinkingInJava.study.chapter14.classTypeInfo.toys.ToyFactory");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces()){
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

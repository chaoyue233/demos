package chaoyue.thinkingInJava.study.chapter20.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 传入参数为需要跟踪的ID 需要跟踪的Class
 */
public class UserCaseTracker {
    public static void trackUseCase(List<Integer> useCases, Class<?> cl) {
        // 获取当前类的方法（因为注解是打在方法上的，所以要先获取方法）
        for (Method m : cl.getDeclaredMethods()) {
            // 获取当前方法的注解
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                // 获取到注解中标识的内容
                System.out.println(String.format("found use case: %s , %s", uc.id(), uc.description()));
                // 只是为了输出没有匹配到的内容而已 没啥软用
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("warning: missing use case-" + i);
        }

    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 1, 2, 3);
        trackUseCase(useCases, PasswordUtils.class);
    }
}


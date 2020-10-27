package dynamic;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author 马小姐
 * @Date 2020-10-27 16:26
 * @Version 1.0
 * @Description:
 */
public class BeforeNew  implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("新的额外功能");
    }
}

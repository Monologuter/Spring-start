package dynamic;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author 马小姐
 * @Date 2020-10-27 14:43
 * @Version 1.0
 * @Description: 将需要运行在原始功能之前的功能书写在此处
 */
public class Before implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("method before advice log= " + method);

    }
}

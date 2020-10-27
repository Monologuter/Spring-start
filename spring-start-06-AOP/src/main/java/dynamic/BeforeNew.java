package dynamic;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author 马小姐
 * @Date 2020-10-27 16:26
 * @Version 1.0
 * @Description:
 *
 * before方法中三个参数详解
 *  Method代表的是额外功能所增加给的那个原始的方法  如果是login()方法之前执行的话就代表的是login()方法
 *  Object数组代表的是额外功能增加给的那个原始方法的方法参数  如果是login(String name , String password) 代表的就是name和password   如果是register()方法代表的就是User对象
 *  最后一个参数Object代表的是原始方法 如果增加的是给login()方法那么代表的就是包含这个方法的实现类  此处就是UserServiceImpl   如果是register那么就是OrderServiceImpl
 */
public class BeforeNew  implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("新的额外功能");
    }
}

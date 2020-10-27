package dynamic;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author 马小姐
 * @Date 2020-10-27 16:51
 * @Version 1.0
 * @Description:
 */
public class Around implements MethodInterceptor {
    /*
    * invoke方法的作用：额外功能书写在invoke方法中 就可以运行在原始方法之前或者之后或者之前和之后
    * 确实一件事：原始方法怎么运行  参数 methodInvocation  额外功能增加给的那个原始方法
    * 返回值 Obect  原始方法的返回值
    *
    *
    *
    * */


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object proceed = methodInvocation.proceed();
        return proceed;
    }
}

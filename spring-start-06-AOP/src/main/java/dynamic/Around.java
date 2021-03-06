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
//        System.out.println("额外功能");
//        Object proceed = null;
//        try {
//            proceed = methodInvocation.proceed();
//        } catch (Throwable throwable) {
//            System.out.println("原始代码抛出异常执行");
//            throwable.printStackTrace();
//        }
//        System.out.println("额外功能");
//        return proceed;
        System.out.println("运行在原始方法之前");
        Object proceed = methodInvocation.proceed();
//      return proceed;   //return返回值直接作为invoke方法的返回值返回，MethodInterceptor不会影响原始方法的返回值
//      MethodInterceptor要想影响原始方法的返回值就不要直接返回原始方法的返回结果即可

        return false;
    }
}

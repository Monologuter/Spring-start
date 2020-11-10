package com.educy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author 马小姐
 * @ClassName MyApsect
 * @Date 2020-11-10 14:47
 * @Version 1.0
 * @Description:
 */
@Aspect
@Component
public class MyApsect {
    @Pointcut("execution(* com.educy.aop..*.*(..))")
    public void pointCut() {

    }
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("-------------log-------------");
        Object proceed = joinPoint.proceed();
        return proceed;
    }
}

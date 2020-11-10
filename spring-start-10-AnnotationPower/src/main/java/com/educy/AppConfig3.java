package com.educy;

import com.educy.bean.Customer;
import org.springframework.context.annotation.*;


/**
 * @Author 马小姐
 * @Date 2020-11-09 14:33
 * @Version 1.0
 * @Description: Configuration其实就是@Component的衍生注解
 */


@Configuration
@ComponentScan(basePackages = "com.educy.aop")
@EnableAspectJAutoProxy
public class AppConfig3 {


}

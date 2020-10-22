package com.educy;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 马小姐
 * @Date 2020-10-20 21:48
 * @Version 1.0
 * @Description:
 */
public class SpringTest {
    @Test
     public void show(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
        People people = classPathXmlApplicationContext.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();

    }
}

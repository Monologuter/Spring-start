package com.educy.life;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author 马小姐
 * @Date 2020-11-07 09:26
 * @Version 1.0
 * @Description:
 */
@Component

public class Product {

    @PostConstruct
    public void myInit(){
        System.out.println("初始化");
    }


    @PreDestroy
    public void destory() {
        System.out.println("销毁");
    }
}

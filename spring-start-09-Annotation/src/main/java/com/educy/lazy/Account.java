package com.educy.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Author 马小姐
 * @Date 2020-11-07 09:20
 * @Version 1.0
 * @Description:
 */
@Component
@Lazy
public class Account {
    public Account() {
        System.out.println("你妈炸了");
    }
}

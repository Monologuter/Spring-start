package com.educy.scope;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author 马小姐
 * @Date 2020-11-07 09:13
 * @Version 1.0
 * @Description:
 */
@Component
//@Scope("prototype")
@Scope("singleton")
public class Customer {

}

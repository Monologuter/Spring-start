package com.educy.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author 马小姐
 * @Date 2020-11-09 16:26
 * @Version 1.0
 * @Description:
 */

@Data
@Component
public class Customer implements Serializable {
    private  Integer id;
    private  String name;
}

package com.educy;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author 马小姐
 * @Date 2020-10-20 21:41
 * @Version 1.0
 * @Description:
 */


@Data

public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name ;

}

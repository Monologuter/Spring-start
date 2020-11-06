package com.educy;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author 马小姐
 * @Date 2020-11-06 17:35
 * @Version 1.0
 * @Description:
 */


@Component
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;

}

package educy.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 马小姐
 * @Date 2020-11-03 09:38
 * @Version 1.0
 * @Description:
 */

@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
}

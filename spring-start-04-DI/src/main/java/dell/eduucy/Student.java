package dell.eduucy;

import lombok.Data;

import java.util.*;

/**
 * @Author 马小姐
 * @Date 2020-10-08 10:34
 * @Version 1.0
 * @Description:
 */
@Data
public class Student {
    private String name;
    private Address address;
    private String[] book;
    private List<String> hobbys;
    private Map<String , String> stuCard;
    private Set<String> games;
    private Properties info;
    private String wife;
}

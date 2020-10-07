package dell.educy;

import lombok.Data;
import sun.nio.cs.US_ASCII;

/**
 * @Author 马小姐
 * @Date 2020-10-07 19:32
 * @Version 1.0
 * @Description:
 */
@Data
public class User {
    private  String name;


    public User(){
        System.out.println("无参构造");
    }

    public User(String name) {
        this.name = name;
    }


    void show() {
        System.out.println("name:"+name);
    }
}

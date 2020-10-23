package dell.eduucy;

import java.io.Serializable;

/**
 * @Author 马小姐
 * @Date 2020-10-23 17:22
 * @Version 1.0
 * @Description:
 */
public class Customer  implements Serializable {
    private String name;
    private int age;


    public Customer(String name) {
        this.name = name;
    }

    public Customer(int age) {
        this.age = age;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

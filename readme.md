### IOC创建对象的方式
#### 1、使用无参构造创建对象  默认方式 
    <property name="name" value="陈亚" />
#### 2、有参构造的第一种方式下标赋值 
    <constructor-arg index="0" value="陈亚你属猪的吗"></constructor-arg>
#### 3、第三种使用传递值的类型进行创建  但是不建议使用 
    <constructor-arg type="java.lang.String" value="陈亚plus"></constructor-arg>
#### 4、直接通过参数名来设置 
    <constructor-arg name="name" value="陈亚pro"></constructor-arg>



```java
User.java
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

```





```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
    <!--使用spring来创建我们的对象 在spring里面的这些都称为bean-->

    <bean id="user"  class="dell.educy.User">
<!--        第一种使用无参构造去创建-->
<!--        <property name="name" value="陈亚" />-->


<!--        第二种使用有参构造的第一种方式下标赋值的方式-->
<!--        <constructor-arg index="0" value="陈亚你属猪的吗"></constructor-arg>-->


<!--        第三种使用传递值的类型进行创建  但是不建议使用-->
<!--        <constructor-arg type="java.lang.String" value="陈亚plus"></constructor-arg>-->

<!--        第四种  直接通过参数名来设置-->
        <constructor-arg name="name" value="陈亚pro"></constructor-arg>
    </bean>
</beans>
```



```java
package dell.educy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 马小姐
 * @Date 2020-10-07 19:34
 * @Version 1.0
 * @Description:
 */

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");
        user.show();

    }
}
```















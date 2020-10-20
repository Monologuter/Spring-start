### 一、IOC创建对象的方式
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



### 二、实例化的时间是什么时候？

#### 1、我们再注册一个bean   UserT  且不为其赋值

```xml
<bean id="userT" class="dell.educy.UserT" >
</bean>
```



#### 2、我们再次进行测试

![6Vyg55-2020-10-08-09-12-39](https://cyymacbookpro.oss-cn-shanghai.aliyuncs.com/Macbookpro/6Vyg55-2020-10-08-09-12-39)



可以看出在注册bean的时候就已经进行实例化了 在调用之前就已经创建好了放到容器里面了 需要用的时候直接get就好了

spring容器就像一个婚介所   

![RVPBcB-2020-10-08-09-17-02](https://cyymacbookpro.oss-cn-shanghai.aliyuncs.com/Macbookpro/RVPBcB-2020-10-08-09-17-02)

而且get到的是同一个对象

### 三、spring的配置

#### 1、别名



```xml
<!--如果取了别名 我们也可以使用别名进行获取到 直接使用原来的名字也是可以的-->
    <alias name="user" alias="cyyuser"/>
```



####  2、 bean的基本配置(还有复杂的后面再学习)



```xml
   <!--
        id bean的唯一标识符也就是相当于我们学习的对象名
        class bean对象所对应的全限定名 包名+类名
        name 也是别名  而且name更高级 可以取多个别名 直接可以使用逗号分隔  也可以直接使用空格分隔
        

    -->
    <bean id="userT" class="dell.educy.UserT" name="cyyUser,dell,huayan,majingxian">

    </bean>
```





#### 3.3、import

一般用于团队开发 将多个配置文件导入合并为一个，假设有多个人在一起开发一个项目的时候  这三个人不需要复制别人配置  不同的类需要注册在不同的bean中 我们可以使用import将所有人的xml配置合并成一个总的配置  使用的时候直接使用总的配置就好了

```xml
 <import resource="bean.xml"/>
    <import resource="bean2.xml"/>
    <import resource="bean3.xml"/>

```



![EU7ksu-2020-10-08-10-14-39](https://cyymacbookpro.oss-cn-shanghai.aliyuncs.com/Macbookpro/EU7ksu-2020-10-08-10-14-39)



### 四、依赖注入

#### 1、构造器注入

​	前面已经学习了

#### 2、使用set方式注入【重点】

##### ①、什么是依赖注入：本质是set注入

​	bean对象的创建爱依赖于容器

​	bean对象中的所有属性由容器注入

​	

②、环境搭建

​	复杂类型

```java
@Data
public class Address {
    private  String address;
}
```



​	真实测试对象

```java
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
```



applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
    <!--使用spring来创建我们的对象 在spring里面的这些都称为bean-->

<!--    第一种普通纸注入直接使用value就好了-->
    <bean name="student" class="dell.eduucy.Student">
        <property name="name" value="陈亚"></property>
    </bean>

</beans>
```



测试类

```java
package dell.educy;

import dell.eduucy.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 马小姐
 * @Date 2020-10-08 10:41
 * @Version 1.0
 * @Description:
 */
public class SpringTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) classPathXmlApplicationContext.getBean("student");
        System.out.println(student.toString());

    }
}
```



#### 3、其他方式注入

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
    <!--使用spring来创建我们的对象 在spring里面的这些都称为bean-->


    <bean id="address" class="dell.eduucy.Address" >
        <property name="address" value="江苏省"/>
    </bean>


    <bean id="student" class="dell.eduucy.Student">
        <!--    第一种普通纸注入直接使用value就好了-->
        <property name="name" value="陈亚"/>

<!--        第二种使用bean注入 使用ref-->
        <property name="address" ref="address"/>

        <property name="book">
            <array>
                <value>红楼梦</value>
                <value>水浒传</value>
                <value>西游记</value>
                <value>三国演义</value>
            </array>
        </property>

        <property name="hobbys" >
            <list>
                <value>跳舞</value>
                <value>唱歌</value>
                <value>rap</value>
                <value>篮球</value>
            </list>
        </property>

        <property name="stuCard">
            <map>
                <entry key="1" value="陈亚"/>
                <entry key ="2" value="马静娴"/>
            </map>
        </property>

        <property name="games">
            <set>
                <value>陈亚</value>
                <value>马静娴</value>
                <value>华妍</value>
            </set>
        </property>

        <property name="info">
            <props>
                <prop key="1">你是猪吗</prop>
                <prop key="2">你是狗吗</prop>
                <prop key="3">你是个垃圾</prop>
                <prop key="4">你就是只猪</prop>
            </props>
        </property>
        <property name="wife">
            <null></null>
        </property>
    </bean>
</beans>
```



输出结果

![eDKFoR-2020-10-08-11-28-53](https://cyymacbookpro.oss-cn-shanghai.aliyuncs.com/Macbookpro/eDKFoR-2020-10-08-11-28-53)




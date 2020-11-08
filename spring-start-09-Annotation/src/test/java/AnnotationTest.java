import com.educy.Mapper.Category;
import com.educy.Mapper.UserServiceMapper;
import com.educy.entity.User;
import com.educy.lazy.Account;
import com.educy.scope.Customer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @Author 马小姐
 * @Date 2020-11-06 17:40
 * @Version 1.0
 * @Description:
 */
public class AnnotationTest {
    /**
     * 测试内容:测试Component注解
     */
    @Test
    public void test() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User) classPathXmlApplicationContext.getBean("u");

        System.out.println("userid = " + user.getId());
    }

    /**
     * 测试内容:测试scope注解
     */
    @Test
    public void test2() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Customer customer = (Customer) classPathXmlApplicationContext.getBean("customer");
        Customer customer1 = (Customer) classPathXmlApplicationContext.getBean("customer");
        System.out.println("customer = " + customer);
        System.out.println("customer1 = " + customer1);

    }


    /**
     * 测试内容:测试lazy注解  一旦使用了lazy注解之后  就不会在getben的时候创建对象了  等到需要使用到的时候再创建对象
     */
    @Test
    public void test3() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Account account = (Account) classPathXmlApplicationContext.getBean("account");

    }


    /**
     * 测试内容:测试生命周期相关的注解
     * 注意事项  上述关于生命周期的两个注解不是spring提供的 而是JSR(JavaEE)520提供的
     */
    @Test
    public void test4() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        classPathXmlApplicationContext.close();
    }

    /**
     * 测试内容:测试Autowired注解
     * 注意事项：Autowirea的注解是基于类型来注入的
     * 注入的类型必须是目标成员变量相同的类型或者是子类乃至实现类
     * 也可以将Autowired注解放置在成员变量上面  有的时候使用lombox插件的时候就这样使用
     * 但是实现的方式是通过反射实现的 并没有调用set方法进行注入 通过反射可以为一个类的成员变量的私有属性进行赋值
     * 最终的效果是一样的更加推荐的使用方式是第二种方式 因为代码简洁
     * 还可以使用Resource注解进行名字注入 @Resource(name = "userMapperImpl")  但是name值要和成员变量的id值保持一致
     * 也可以不添加name属性  直接@Resource  通过类型进行注入
     * 如果在应用@Resource注解的时候  名字没有配对成功  他会继续基于类型进行配对
     * 还有 @Inject注解 和 @Autowired注解是完全一致的都是基于类型来注入的
     *
     */
    @Test
    public void test5() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserServiceMapper userServiceMapperImpl = (UserServiceMapper) classPathXmlApplicationContext.getBean("userServiceMapperImpl");
        userServiceMapperImpl.register();
        classPathXmlApplicationContext.close();

    }


    /**
     * 测试内容:测试@Value注解
     */
    @Test
    public void test6() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Category category = (Category) classPathXmlApplicationContext.getBean("category");

        System.out.println("name:"+category.getName() + "            id:"+category.getId());

    }
}

package dell.life;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author 马小姐
 * @Date 2020-10-26 11:46
 * @Version 1.0
 * @Description:
 */
@Data
public class Product implements InitializingBean {
    public Product(){
        System.out.println("无参构造");
    }


//    这个就是初始化代码 我们可以做一些初始化的操作 spring会进行调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Product.afterPropertiesSet");
    }
}

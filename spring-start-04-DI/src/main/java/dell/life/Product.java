package dell.life;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author 马小姐
 * @Date 2020-10-26 11:46
 * @Version 1.0
 * @Description:
 */
@Data
public class Product implements InitializingBean , DisposableBean {
    private  String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("Product.setName");
    }

    public Product(){
        System.out.println("无参构造");
    }


//    这个就是初始化代码 我们可以做一些初始化的操作 spring会进行调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Product.afterPropertiesSet");
    }

    public void myInit(){
        System.out.println("Product.myInit");
    }


    @Override
//    销毁方法
    public void destroy() throws Exception {
        System.out.println("Product.destroy");
    }


//    自定义销毁方法
    public void myDestory(){
        System.out.println("Product.myDestory");
    }
}

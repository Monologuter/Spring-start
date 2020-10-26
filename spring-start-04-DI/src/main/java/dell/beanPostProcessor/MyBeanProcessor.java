package dell.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import sun.awt.geom.AreaOp;

/**
 * @Author 马小姐
 * @Date 2020-10-26 19:38
 * @Version 1.0
 * @Description:
 */
public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Categroy) {
            Categroy categroy = (Categroy) bean;
            categroy.setName("小王八蛋");
        }
        return bean ;
    }
}

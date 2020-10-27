package springProxy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.core.annotation.Order;

/**
 * @Author 马小姐
 * @Date 2020-10-27 10:29
 * @Version 1.0
 * @Description:
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public void showOrder() {
        System.out.println("OrderServiceImpl.showOrder");
    }
}

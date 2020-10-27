package springProxy;

/**
 * @Author 马小姐
 * @Date 2020-10-27 10:24
 * @Version 1.0
 * @Description:
 */
public class OrderServiceProxy implements OrderService{

    private OrderServiceImpl orderService = new OrderServiceImpl();


    @Override
    public void showOrder() {
        System.out.println("日志的原始功能");
        orderService.showOrder();
    }
}

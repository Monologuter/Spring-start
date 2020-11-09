import com.educy.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 马小姐
 * @Date 2020-11-09 14:37
 * @Version 1.0
 * @Description:
 */
public class TestAnnotation {
    /**
     * 测试内容:测试配置bean
     */
    @Test
    public void test() {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.educy");



    }
}

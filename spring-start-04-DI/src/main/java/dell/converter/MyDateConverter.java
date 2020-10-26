package dell.converter;

import lombok.Data;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 马小姐
 * @Date 2020-10-26 16:51
 * @Version 1.0
 * @Description:  实现Connverter接口将字符串类型转换为日期类型  参数s就是配置文件中的日期字符串
 * return就是将转换好的日期格式自动为birthday属性赋值
 */
@Data
public class MyDateConverter implements Converter<String,Date> {
    private  String pattern;
    @Override
    public Date convert(String s) {
        Date date = null;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            date = sdf.parse(s);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}

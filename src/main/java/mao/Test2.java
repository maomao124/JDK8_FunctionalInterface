package mao;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * Project name(项目名称)：JDK8_FunctionalInterface
 * Package(包名): mao
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/20
 * Time(创建时间)： 18:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test2
{
    public static void main(String[] args)
    {
        test(s -> System.out.println(s.toUpperCase(Locale.ROOT)));
    }

    private static void test(Consumer<String> consumer)
    {
        consumer.accept("hello");
    }
}

package mao;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * Project name(项目名称)：JDK8_FunctionalInterface
 * Package(包名): mao
 * Class(类名): Test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/20
 * Time(创建时间)： 18:35
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test3
{
    public static void main(String[] args)
    {
        test(s -> System.out.println(s.toUpperCase(Locale.ROOT)),
                s -> System.out.println(s.length()));
    }

    private static void test(Consumer<String> consumer1,Consumer<String> consumer2)
    {
        //consumer1.accept("hello");
        //consumer2.accept("world");
        consumer2.andThen(consumer1).accept("world");
        consumer1.andThen(consumer2).accept("world");
    }
}

package mao;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Project name(项目名称)：JDK8_FunctionalInterface
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/20
 * Time(创建时间)： 18:03
 * Version(版本): 1.0
 * Description(描述)： Supplier
 */

public class Test1
{
    public static void main(String[] args)
    {
        printMax(() ->
        {
            int[] arr = {10, 20, 100, 30, 40, 50};
            Arrays.sort(arr);
            return arr[arr.length - 1];
        });
    }

    private static void printMax(Supplier<Integer> supplier)
    {
        int max = supplier.get();
        System.out.println("max = " + max);
    }
}

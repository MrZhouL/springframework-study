/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/21 下午1:14
 * Description: 模版方法模式测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package templetemethodpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈模版方法模式测试类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ClientTest {
    public static void main(String[] args) {
        AbstractClass a = null;

        a = new ConcreteClassA();

        a.templateMethod();

        a = new ConcreteClassB();
        a.templateMethod();
    }
}

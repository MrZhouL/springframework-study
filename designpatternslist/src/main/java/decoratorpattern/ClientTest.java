/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/21 上午12:55
 * Description: 客户端测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package decoratorpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈修饰模式客户端测试〉
 *
 * @author zhoulei
 * @create 2018/4/21我
 * @since 1.0.0
 */
public class ClientTest {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConreteDecoratorB conreteDecoratorB = new ConreteDecoratorB();

        concreteDecoratorA.setComponent(concreteComponent);
        conreteDecoratorB.setComponent(concreteDecoratorA);

        conreteDecoratorB.Operation();
        conreteDecoratorB.Operation();
        conreteDecoratorB.Operation();
    }
}

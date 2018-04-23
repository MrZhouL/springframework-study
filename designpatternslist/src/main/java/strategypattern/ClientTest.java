/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/20 下午11:42
 * Description: 策略模式客户端测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package strategypattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈策略模式客户端测试〉
 *
 * @author zhoulei
 * @create 2018/4/20
 * @since 1.0.0
 */
public class ClientTest {
    public static void main(String[] args) {
        //策略模式下客户端调用
        Context context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        Context contextB = new Context(new ConcreteStrategyB());
        contextB.ContextInterface();

        //策略模式和简单工厂模式结合客户端调用
        Context context1 = new Context("执行算法A");
        context1.ContextInterface();

        Context context2 = new Context("执行算法B");
        context2.ContextInterface();
    }
}

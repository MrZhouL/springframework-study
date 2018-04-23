/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/21 上午10:21
 * Description: 工厂方法模式客户端测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package simplefactorymethodpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工厂方法模式客户端测试类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ClientTest {


    public static void main(String[] args) throws Exception {
        /*
            这里解决的就是简化生成对象的重复代码，增加程序的可扩展性
         */
        IFactory operationFactory = new AddFaction();
        Operation oper = operationFactory.createOperaction();
        oper.set_NumberA(100);
        oper.set_NumberB(3);
        double result = oper.getResult();
        System.out.println(result);
    }

}

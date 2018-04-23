/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/21 下午4:11
 * Description: 观察者模式--客户端测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package publishsubscribepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈观察者模式--客户端测试〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ClientTest {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //添加观察者
        concreteSubject.Attach(new ConcreteObServer("张三",concreteSubject));

        concreteSubject.Attach(new ConcreteObServer("李四",concreteSubject));

        concreteSubject.Attach(new ConcreteObServer("王五",concreteSubject));

        concreteSubject.setSubjectState("我要下线了");
        concreteSubject.Notify();//通知


    }

}

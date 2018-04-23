/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ConcreteObServer
 * Author:   zhoulei
 * Date:     2018/4/21 下午4:03
 * Description: 具体观察者。实现抽象观察者角色所要求的更新接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package publishsubscribepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈具体观察者。实现抽象观察者角色所要求的更新接口〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ConcreteObServer extends ObServer{

    private String name; //观察者名字
    private String obServerState; //观察的状态
    private ConcreteSubject concreteSubject;//指向具体主题的对象引用

    public ConcreteObServer(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        String subjectState = concreteSubject.getSubjectState();
        System.out.println("观察者"+name+"的新状态是"+subjectState);
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
}

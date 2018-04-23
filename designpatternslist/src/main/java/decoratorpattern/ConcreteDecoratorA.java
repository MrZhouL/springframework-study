/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ConcreteDecoratorA
 * Author:   zhoulei
 * Date:     2018/4/21 上午12:46
 * Description: 具体的装饰类A，给组件增加新功能的类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package decoratorpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈具体的装饰类A，给组件增加新功能的类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ConcreteDecoratorA extends Decorator{

    private String nishisb;//本类独有的功能哟！！

    @Override
    public void Operation() {
        //这里先调用父类的操作方法，在执行需要增强的方法或字段。
        super.Operation();

        nishisb = "你就是大傻逼";
        System.out.println("我真强了：因为我可以骂人了："+nishisb);
    }
}

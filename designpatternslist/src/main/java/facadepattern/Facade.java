/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Facade
 * Author:   zhoulei
 * Date:     2018/4/21 下午1:32
 * Description: 外观设计模式 外观类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package facadepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈外观设计模式 外观类〉
 * 何时使用外观模式？
 *
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class Facade {
    SubsystemOne subsystemOne;
    SubsystemTwo subsystemTwo;

    public Facade() {
        subsystemOne = new SubsystemOne();
        subsystemTwo = new SubsystemTwo();
    }

    public void methodA(){
        System.out.println("方法组A（）------\n");
        subsystemOne.methodOne();
        subsystemTwo.methodTwo();
    }

    public void methodB(){
        System.out.println("方法组B（）-----\n");
        subsystemTwo.methodTwo();
    }
}


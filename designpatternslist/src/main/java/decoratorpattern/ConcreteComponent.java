/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ConcreteComponent
 * Author:   zhoulei
 * Date:     2018/4/21 上午12:39
 * Description: 具体的组件类。继承组件类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package decoratorpattern;

/**
 * 〈具体实现的组件类，例如以前service中的impl实现类。〉<br>
 * 〈具体实现的组件类。继承组件类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ConcreteComponent extends Component {

    @Override
    public void Operation() {
        System.out.println("我是以前service中的业务实现方法");
    }
}

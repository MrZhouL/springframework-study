/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Decorator
 * Author:   zhoulei
 * Date:     2018/4/21 上午12:42
 * Description: 装饰抽象类，继承Component，从外类来扩展Component类的功能
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package decoratorpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈装饰抽象类，继承Component，从外类来扩展Component类的功能〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public abstract class Decorator extends Component{
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null) {
            component.Operation();
        }
    }
}

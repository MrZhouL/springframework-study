/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ObServer
 * Author:   zhoulei
 * Date:     2018/4/21 下午3:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package publishsubscribepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈抽象观察者，为具体的观察者提供定义的一个接口或者抽象类。在得到主题的通知后更新自己。〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public abstract class ObServer {
    public abstract void update();
}

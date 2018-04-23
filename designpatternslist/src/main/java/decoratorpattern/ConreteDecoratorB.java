/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ConreteDecoratorB
 * Author:   zhoulei
 * Date:     2018/4/21 上午12:52
 * Description: 具体的装饰类B
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package decoratorpattern;

/**
 * 〈简单的说装饰者模式就是在调用了父类方法的基础上在执行自己的方法〉<br>
 * 〈具体的装饰类B〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ConreteDecoratorB extends Decorator{
    private void operationSky(){
        System.out.println("我可以操控天空");
    }

    @Override
    public void Operation() {
        super.Operation();
        operationSky();
    }
}

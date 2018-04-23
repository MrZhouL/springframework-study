/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ConcreteStrategyA
 * Author:   zhoulei
 * Date:     2018/4/20 下午11:36
 * Description: 具体算法（策略）A
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package strategypattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈具体算法（策略）A〉
 *
 * @author zhoulei
 * @create 2018/4/20
 * @since 1.0.0
 */
public class ConcreteStrategyA extends Strategy{

    @Override
    public void algorithm() {
        System.out.println("执行算法a里的算法");
    }
}

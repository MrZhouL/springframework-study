/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ConcreteStrategyB
 * Author:   zhoulei
 * Date:     2018/4/20 下午11:38
 * Description: 具体算法（策略）B
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package strategypattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈具体算法（策略）B〉
 *
 * @author zhoulei
 * @create 2018/4/20
 * @since 1.0.0
 */
public class ConcreteStrategyB extends Strategy{

    @Override
    public void algorithm() {
        System.out.println("执行算法b里面的算法");
    }
}

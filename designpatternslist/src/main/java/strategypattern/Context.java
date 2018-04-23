/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Context
 * Author:   zhoulei
 * Date:     2018/4/20 下午11:38
 * Description: 策略（算法）上下文对象
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package strategypattern;

/**
 * 〈一句话功能简述〉<br>
 * 〈策略（算法）上下文对象〉
 *
 * @author zhoulei
 * @create 2018/4/20
 * @since 1.0.0
 */
public class Context {
    private Strategy strategy;

    /**
     * 使用的是策略模式，在此基础上可以进行优化
     *
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 和简单工厂模式结合使用
     *
     * @param type
     */
    public Context(String type) {
        switch (type) {
            case "执行算法A":
                strategy = new ConcreteStrategyA();
                break;
            case "执行算法B":
                strategy = new ConcreteStrategyB();
                break;
        }
    }


    //上下文接口
    public void ContextInterface() {
        strategy.algorithm();
    }
}

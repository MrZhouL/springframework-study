/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Operation
 * Author:   zhoulei
 * Date:     2018/4/20 下午10:34
 * Description: 运算操作类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package simplefactorypattern;

/**
 * 〈简单设计模式案例之操作类〉<br>
 * 〈运算操作类〉
 *
 * @author zhoulei
 * @create 2018/4/20
 * @since 1.0.0
 */
public class Operation {
    private double _NumberA = 0;
    private double _NumberB = 0;

    public double getResult() throws Exception {
        double result = 0;
        return result;
    }

    public double get_NumberA() {
        return _NumberA;
    }

    public void set_NumberA(double _NumberA) {
        this._NumberA = _NumberA;
    }

    public double get_NumberB() {
        return _NumberB;
    }

    public void set_NumberB(double _NumberB) {
        this._NumberB = _NumberB;
    }
}

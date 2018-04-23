/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Operaction
 * Author:   zhoulei
 * Date:     2018/4/21 上午10:00
 * Description: 简单工厂方法模式之操作类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package simplefactorymethodpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈简单工厂方法模式之操作类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class Operation {
    private double _NumberA;
    private double _NumberB;

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

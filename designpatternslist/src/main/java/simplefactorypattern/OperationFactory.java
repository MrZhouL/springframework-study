/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OperationFactory
 * Author:   zhoulei
 * Date:     2018/4/20 下午10:50
 * Description: 运算操作类工厂类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package simplefactorypattern;

/**
 * 〈一句话功能简述〉<br>
 * 〈运算操作类工厂类〉
 *
 * @author zhoulei
 * @create 2018/4/20
 * @since 1.0.0
 */
public class OperationFactory {
    /**
     * 工厂类对象创建方法
     *
     * @param operat
     * @return
     */
    public static Operation createOperation(String operat) {
        Operation oper = null;
        switch (operat) {
            case "+":
                oper = new OperactionAdd();
                break;
            case "-":
                oper = new OperactionSub();
                break;
            case "*":
                oper = new OperactionMul();
                break;
            case "/":
                oper = new OperactionDiv();
                break;
        }
        return oper;
    }
}

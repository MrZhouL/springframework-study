/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/20 下午11:00
 * Description: 客户端测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package simplefactorypattern;

/**
 * 〈各种模式的客户端测试代码〉<br>
 * 〈客户端测试〉
 *
 * @author zhoulei
 * @create 2018/4/20
 * @since 1.0.0
 */
public class ClientTest {


    public static void main(String[] args) throws Exception {
        Operation operation = OperationFactory.createOperation("+");
        operation.set_NumberA(1213.11);
        operation.set_NumberB(23432);
        double result = operation.getResult();
        System.out.println(result);

        Operation operationSub = OperationFactory.createOperation("-");
        operationSub.set_NumberA(2309800.11);
        operation.set_NumberB(12321432.22);
        double r2 = operationSub.getResult();
        System.out.println(r2);

        Operation operationMul = OperationFactory.createOperation("*");
        operationMul.set_NumberB(1111);
        operationMul.set_NumberA(12222);
        double r3 = operationMul.getResult();
        System.out.println(r3);

        Operation operationDiv = OperationFactory.createOperation("/");
        operationDiv.set_NumberA(12345);
        operation.set_NumberB(64312);
        double r4 = operationDiv.getResult();
        System.out.println(r4);
    }
}

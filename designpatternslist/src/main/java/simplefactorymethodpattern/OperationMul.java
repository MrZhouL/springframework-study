/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OperactionMul
 * Author:   zhoulei
 * Date:     2018/4/20 下午10:45
 * Description: 乘法运算操作类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package simplefactorymethodpattern;



/**
 * 〈一句话功能简述〉<br> 
 * 〈乘法运算操作类〉
 *
 * @author zhoulei
 * @create 2018/4/20
 * @since 1.0.0
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return get_NumberA() * get_NumberB();
    }
}

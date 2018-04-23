/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OperactionDiv
 * Author:   zhoulei
 * Date:     2018/4/20 下午10:47
 * Description: 除法运算操作类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package simplefactorymethodpattern;


/**
 * 〈一句话功能简述〉<br> 
 * 〈除法运算操作类〉
 *
 * @author zhoulei
 * @create 2018/4/20
 * @since 1.0.0
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        if (get_NumberA() == 0){
            throw new Exception("除数不能为0");
        }
        return get_NumberA() / get_NumberB();
    }
}

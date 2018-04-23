/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AddFaction
 * Author:   zhoulei
 * Date:     2018/4/21 上午10:04
 * Description: 加法类工厂
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package simplefactorymethodpattern;


/**
 * 〈一句话功能简述〉<br> 
 * 〈加法类工厂〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class AddFaction implements IFactory{

    @Override
    public Operation createOperaction() {
        return new OperactionAdd();
    }
}

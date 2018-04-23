/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: SubFaction
 * Author:   zhoulei
 * Date:     2018/4/21 上午10:19
 * Description: 加法工厂类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package simplefactorymethodpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈加法工厂类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class SubFaction implements IFactory {

    @Override
    public Operation createOperaction() {
        return new OperactionSub();
    }
}

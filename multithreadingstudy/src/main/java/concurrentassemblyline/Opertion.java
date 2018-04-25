/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Opertion
 * Author:   zhoulei
 * Date:     2018/4/25 下午12:41
 * Description: 不使用多线程计算
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package concurrentassemblyline;

/**
 * 〈一句话功能简述〉<br> 
 * 〈不使用多线程计算〉
 *
 * @author zhoulei
 * @create 2018/4/25
 * @since 1.0.0
 */
public class Opertion {

    public double jisuan(Msg msg){
        double v = (msg.i + msg.j) * msg.i / 2;
        System.out.println(msg.orgStr + "= "+ v);
        return v;
    }
}

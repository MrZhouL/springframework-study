/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: RealSubject
 * Author:   zhoulei
 * Date:     2018/4/21 上午1:21
 * Description: 代理所代表的真实实体
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package proxypattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈代理所代表的真实实体〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("我是真实请求");
    }
}

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Porxy
 * Author:   zhoulei
 * Date:     2018/4/21 上午1:23
 * Description: 代理类，保存一个引用使得代理可以访问实体
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package proxypattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈代理类，保存一个引用使得代理可以访问实体〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class Porxy extends Subject{
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}

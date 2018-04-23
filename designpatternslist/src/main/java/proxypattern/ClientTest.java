/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/21 上午1:26
 * Description: 测试代理模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package proxypattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试代理模式〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ClientTest {
    public static void main(String[] args) {
        Porxy porxy = new Porxy();
        porxy.request();
    }
}

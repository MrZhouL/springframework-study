/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/21 下午1:37
 * Description: 外观设计模式test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package facadepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈外观设计模式test〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ClientTest {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
    }

}

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/21 下午2:40
 * Description: 建造者模式客户端测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package builderpepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈建造者模式客户端测试类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ClientTest {
    public static void main(String[] args) {
        Director director = new Director();

        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);
        director.construct(b2);

        Product p1 = b1.getResult();
        Product p2 = b2.getResult();

        p1.show();
        p2.show();
    }

}

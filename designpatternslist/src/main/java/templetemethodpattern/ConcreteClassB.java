/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ConcreteClassB
 * Author:   zhoulei
 * Date:     2018/4/21 下午1:12
 * Description: 具体的实现类b
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package templetemethodpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈具体的实现类b〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ConcreteClassB extends AbstractClass{

    @Override
    public void primitiveOperation1() {
        System.out.println("具体的实现类b方法1实现");

    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体的实现类b方法2实现");
    }
}

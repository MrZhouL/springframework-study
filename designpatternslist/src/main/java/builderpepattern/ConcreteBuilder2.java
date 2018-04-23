/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ConcreteBuilder2
 * Author:   zhoulei
 * Date:     2018/4/21 下午2:36
 * Description: 具体建造者类2号
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package builderpepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈具体建造者类2号〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ConcreteBuilder2 extends Builder{
    private Product product = new Product();


    @Override
    public void BuiderPartA() {
        product.add("装配部件x");
    }

    @Override
    public void BuiderPartB() {
        product.add("装配部件y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

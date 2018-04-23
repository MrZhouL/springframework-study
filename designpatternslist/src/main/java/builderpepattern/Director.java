/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Director
 * Author:   zhoulei
 * Date:     2018/4/21 下午2:38
 * Description: 构建者模式---指挥者类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package builderpepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈构建者模式---指挥者类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class Director {
    public void construct(Builder builder){
        //指挥建造过程
        builder.BuiderPartA();
        builder.BuiderPartB();
    }

}

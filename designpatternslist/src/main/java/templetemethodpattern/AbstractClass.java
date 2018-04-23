/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AbstractClass
 * Author:   zhoulei
 * Date:     2018/4/21 下午1:01
 * Description: 抽象模版类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package templetemethodpattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈抽象模版类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public abstract class AbstractClass {
    //原始操作类。
    public abstract void primitiveOperation1();
    //一些抽象行为放到子类去实现
    public abstract void primitiveOperation2();

    public void templateMethod(){
        //模版方法给出了逻辑骨架，而逻辑的组成是一些相应的抽象操作，它们推到子类实现。
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模版方法执行完毕");
    }
}

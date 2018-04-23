/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Product
 * Author:   zhoulei
 * Date:     2018/4/21 下午2:22
 * Description: 建造模式之产品类，由多个部件组成
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package builderpepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈建造模式之产品类，由多个部件组成〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class Product {
    List<String> parts = new ArrayList();

    //添加产品部件
    public void add(String part){
        parts.add(part);
    };

    public void show(){
        System.out.println("构建的产品如下：");
        for (String par:parts) {
            System.out.println("组件有:"+par);
        }
    }

}

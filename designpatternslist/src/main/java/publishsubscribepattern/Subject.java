/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Subject
 * Author:   zhoulei
 * Date:     2018/4/21 下午3:47
 * Description: 观察者模式---抽象通知类。主题类。一般用接口或抽象类实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package publishsubscribepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈观察者模式---抽象通知类。主题类。一般用接口或抽象类实现〉
 *  把所有的观察者对象的引用保存在一个聚集里。
 *  每一个主题或通知都可以有多位观察者。
 *  抽象主题题提供接口，可以增加和删除观察者对象。
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public abstract class Subject {

    private List<ObServer> obService = new ArrayList();

    //添加观察者
    public void Attach(ObServer obServer){
        obService.add(obServer);
    }

    //删除观察者
    public void Detach(ObServer obServer ){
        obService.remove(obServer);
    }

    //发送通知
    public void Notify(){
        for (ObServer os:obService) {
            os.update();
        }
    }

}

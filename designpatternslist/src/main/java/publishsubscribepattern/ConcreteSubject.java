/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ConcreteSubject
 * Author:   zhoulei
 * Date:     2018/4/21 下午4:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package publishsubscribepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈具体主题实或具体通知者。将有关状态存入具体观察者对象。〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ConcreteSubject extends Subject{
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}

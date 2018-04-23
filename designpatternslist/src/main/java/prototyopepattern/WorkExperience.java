/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: WorkExperience
 * Author:   zhoulei
 * Date:     2018/4/21 上午11:38
 * Description: 工作经历类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package prototyopepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工作经历类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class WorkExperience {
    private String workData;

    public WorkExperience(String workData) {
        this.workData = workData;
    }

    public String getWorkData() {
        return workData;
    }

    public void setWorkData(String workData) {
        this.workData = workData;
    }
}

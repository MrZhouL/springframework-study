/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Administrator
 * Author:   zhoulei
 * Date:     2018/4/21 下午12:09
 * Description: 管理猿类，为了测试深复制
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package prototyopepattern;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br> 
 * 〈管理猿类，为了测试深复制〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class Administrator implements Cloneable{
    private User user;
    private Boolean editable;

    @Override
    public String toString() {
        return "Administrator{" +
                "user=" + user +
                ", editable=" + editable +
                '}';
    }

    public Administrator(User user, Boolean editable) {
        this.user = user;
        this.editable = editable;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    protected Administrator clone() throws CloneNotSupportedException {
        //浅复制。
        //return super.clone();
        Administrator clone = (Administrator) super.clone();
        clone.user = (User) user.clone();

        return  clone;


    }





    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }
}

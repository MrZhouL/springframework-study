/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: User
 * Author:   zhoulei
 * Date:     2018/4/21 下午12:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package prototyopepattern;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class User implements Cloneable{
    private String username;
    private String passwrod;
    private Date date;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", passwrod='" + passwrod + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User(String username, String passwrod, Date date) {
        this.username = username;
        this.passwrod = passwrod;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

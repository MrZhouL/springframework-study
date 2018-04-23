/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TestCase
 * Author:   zhoulei
 * Date:     2018/4/21 下午12:13
 * Description: 测试深复制
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package prototyopepattern;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试深复制〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class TestCase {

    public void testAdministratorClone(){

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Administrator administrator = new Administrator(new User("zs","12356",new Date()),true);

        Administrator b = administrator;

        Administrator c = administrator.clone();

        System.out.println(administrator == b);
        System.out.println(administrator.equals(b));

        System.out.println(administrator == c);
        System.out.println(administrator.equals(c));

        System.out.println(administrator.getUser() == c.getUser());
        System.out.println(administrator.getUser().equals(c.getUser()));

        //修改对象时
        c.getUser().setDate(new Date());
        c.getUser().setPasswrod("123");
        c.getUser().setUsername("lisi");
        c.setEditable(false);

        System.out.println("原本对象："+administrator.toString());
        System.out.println("clone对象："+c.toString());




    }

}

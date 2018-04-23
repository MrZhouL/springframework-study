/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ClientTest
 * Author:   zhoulei
 * Date:     2018/4/21 上午11:26
 * Description: 原型模式客户端测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package prototyopepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈原型模式客户端测试类〉
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class ClientTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*Resume resume = new Resume("张三");
        resume.setAge("12");
        resume.setSex("男");
        resume.setTimeArea("2018年11月");
        resume.setCompany("新浪微博");

        resume.Display();

        Resume clone = (Resume) resume.clone();
        clone.Display();*/
    /*以上是浅复制如果有引用对象将不能复制，只会出现最后一次的赋值*/
        Resume a = new Resume("A");
        a.setAge("13");
        a.setSex("女");
        a.setTimeArea("2018年11月");
        a.setCompany("新浪微博");
        a.setWorkExperience(new WorkExperience("2010-9-12 -- 2019-2-2"));

        a.Display();

        Resume b = (Resume) a.clone();
        //b.setWorkExperience(new WorkExperience("1999-10-1"));

        b.Display();

        Resume c  = (Resume) a.clone();
        //c.setSex("男");
        //c.setAge("100");
        //c.setTimeArea("2018年19月");
        //c.setCompany("新浪微博12");
        //c.setWorkExperience(new WorkExperience("2010000"));
        c.Display();

        System.out.println(a.getWorkExperience() == c.getWorkExperience());
        System.out.println(a.getWorkExperience().equals(a.getWorkExperience()));

    }

}

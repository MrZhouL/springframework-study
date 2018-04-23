/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Resume
 * Author:   zhoulei
 * Date:     2018/4/21 上午10:47
 * Description: 原型设计模式案例之简历复制 简历类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package prototyopepattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈原型设计模式案例之简历复制 简历类〉
 * 如果需要一个类有clone功能，必须实现Cloneable接口（虽然它里面什么都没有），这是浅复制
 *
 * @author zhoulei
 * @create 2018/4/21
 * @since 1.0.0
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    private WorkExperience workExperience;//工作经历

    //显示
    public void Display(){
        System.out.println("姓名："+name+"，性别："+sex+"，年龄："+age);
        System.out.println("工作经历："+timeArea+company);
        System.out.println("work:"+workExperience.getWorkData());
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Resume(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

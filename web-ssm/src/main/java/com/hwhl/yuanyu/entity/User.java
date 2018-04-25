package com.hwhl.yuanyu.entity;

import com.hwhl.yuanyu.validatorannotation.*;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by zhoulei on 2018/4/8.
 */
@GroupSequence({RegisterGroupValidator.class,First.class, Second.class, User.class})
public class User implements Serializable {

    private Integer id;

    @NotBlank(groups = {RegisterGroupValidator.class})
    private String nickname;

    @NotBlank(groups = {RegisterGroupValidator.class})
    @StrongPassword(groups = {RegisterGroupValidator.class})
    private String password;

    @NotBlank(groups = {RegisterGroupValidator.class})
    private String headimg;


    @NotBlank(groups = {RegisterGroupValidator.class})
    @PhoneLocalDate(groups = {RegisterGroupValidator.class})
    private String phone;

    private Integer age;

    private String profession;
    private String signature;
    private String character;
    private Integer sex;
    private String city;
    private Double income;
    private Integer eduction;
    private Long birthday;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", headimg='" + headimg + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", signature='" + signature + '\'' +
                ", character='" + character + '\'' +
                ", sex=" + sex +
                ", city='" + city + '\'' +
                ", income=" + income +
                ", eduction=" + eduction +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Integer getEduction() {
        return eduction;
    }

    public void setEduction(Integer eduction) {
        this.eduction = eduction;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }
}

package com.hpp.bean;

import java.io.Serializable;
/**
 * Created by HPP on 2018/4/11.
 */
public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
    private boolean sex;


    public Student() {
    }

    public Student(String id, String name, int age, boolean sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
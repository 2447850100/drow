package com.xiaohu.design.creaetion.singleton.pojo;

import lombok.Data;

import java.util.Objects;
import java.util.Optional;

@Data
public class Person {

    private Integer age;

    private String name;

    private  static  Person instance;

    private Person() {

    }
    public static Person getInstance() {
        if (Optional.ofNullable(instance).isEmpty()) {
            instance = new Person();
            //synchronized (Person.class) {
//                if (Optional.ofNullable(instance).isEmpty()) {
//
//                }
            //}
        }
        return instance;
    }
}

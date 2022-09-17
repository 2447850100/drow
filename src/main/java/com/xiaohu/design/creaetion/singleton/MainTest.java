package com.xiaohu.design.creaetion.singleton;


import com.xiaohu.design.creaetion.builder.Person;

import java.util.Properties;

public class MainTest {
    public static void main(String[] args) {
//        Person person = new Person().setName("xiaohu").setId(1).setAge(10);
//        person.setName("1");
//        System.out.println("person = " + person);
        Person.builder builder = new Person.builder();
        Person person = builder.setId(1).setAge(1).setName("1");
        System.out.println("person = " + person);
    }

    public static void main1(String[] args) {
//        Person person1 = Person.getInstance();
//        Person person2 = Person.getInstance();
        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);

//        for (int i = 0; i < 10000; i++) {
//            new Thread(() -> {
//                Person person1 = Person.getInstance();
//                Person person2 = Person.getInstance();
//                if (person1 != person2) {
//                    System.out.println(1111);
//                }
////                String message = String.format("当前线程 %s person hashcode %s", Thread.currentThread().getName(), person.hashCode() + "");
////                System.out.println(message);
//            },i+"").start();
    }

}

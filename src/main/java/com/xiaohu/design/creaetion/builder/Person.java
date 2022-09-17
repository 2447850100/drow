package com.xiaohu.design.creaetion.builder;

import lombok.ToString;

@ToString
public class Person {

    private Integer id;

    private String name;

    private Integer age;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public Person setId(Integer id) {
        this.id = id;
        return this;
    }
    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }
    public static class builder {

        Person person = new Person();
        private Integer id;

        private String name;

        private Integer age;

        public Integer getId() {
            return id;
        }

        public Person setId(Integer id) {
            person.id = id;
            return person;
        }

        public String getName() {
            return name;
        }

        public Person setName(String name) {
            person.name = name;
            return person;
        }

        public Integer getAge() {
            return age;
        }

        public Person setAge(Integer age) {
           person.age = age;
            return person;
        }
        public  Person build() {
            return person;
        }
    }

}

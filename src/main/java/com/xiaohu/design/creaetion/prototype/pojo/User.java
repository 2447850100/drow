package com.xiaohu.design.creaetion.prototype.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class User implements Cloneable{
    private String name;
    private Integer id;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new User(name, id);
    }
}

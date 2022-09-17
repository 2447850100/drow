package com.xiaohu.design.creaetion.prototype;

import com.xiaohu.design.creaetion.prototype.pojo.MyBatis;
import com.xiaohu.design.creaetion.prototype.pojo.User;

public class MainTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyBatis myBatis = new MyBatis();

        for (int i = 0; i < 5; i++) {
            User user = myBatis.getUser(1);
            if (i==0) {
                user.setName("lisi");
            }
            if (i==1) {
                user.setId(2);
            }
            System.out.printf("第"+i+"次获取 %s%n", user);
        }
//        User user1 = myBatis.getUser(1);
//        user1.setName("lisi");
//        System.out.printf("第1次获取 %s%n", user1);
//        User user2 = myBatis.getUser(1);
//        user2.setId(2);
//        System.out.printf("第2次获取 %s%n", user2);
//        User user3 = myBatis.getUser(1);
//        System.out.printf("第3次获取 %s%n", user3);

    }
}

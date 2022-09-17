package com.xiaohu.design.creaetion.prototype.pojo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyBatis {
    Map<Integer,User> cache = new ConcurrentHashMap<>();

    public User getUser(Integer id) throws CloneNotSupportedException {
        User user;
        if (cache.containsKey(id)) {
             user = cache.get(id);
            user = (User)user.clone();
        }else {
             user = getUserFromDB(id);
        }
        return user;
    }

    private User getUserFromDB(Integer id) throws CloneNotSupportedException {
        User user = new User("张珊", id);
        User cloneUser = (User) user.clone();
        cache.put(id,user);
        return cloneUser;
    }
}

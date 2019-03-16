package com.forever.hungry;

public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    //防止反射创建对象
    private HungrySingleton(){
        throw new RuntimeException("非法操作");
    }

    public static HungrySingleton getInstance(){
        return singleton;
    }
}

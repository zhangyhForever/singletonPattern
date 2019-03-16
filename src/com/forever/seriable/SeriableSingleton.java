package com.forever.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }

    //重写readResolve方法，只不过时覆盖了反序列化出来的对象
    //还是创建了两次，发生在jvm层，相对来说比较安全
    //之前反序列化出来的对象会被GC回收
    private Object readResolve(){
        return seriableSingleton;
    }
}

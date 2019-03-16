package com.forever.lazy;

public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton(){}

    //双重检查锁
    public static LazyDoubleCheckSingleton getInstance(){
        if(singleton == null){
            synchronized(LazyDoubleCheckSingleton.class) {
                if(singleton==null){
                    singleton =  new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}

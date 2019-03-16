package com.forever.lazy;


//性能最优
public class LazyInnerSingleton {

    private LazyInnerSingleton(){}

    //懒汉式单例
    //LazyHolder的逻辑只有在调用时才会被执行
    //巧妙的利用了内部类的特性
    //jvm底层的执行逻辑，完美的避免了线程安全问题
    public static final LazyInnerSingleton getInstance(){
        return LazyHolder.LSZY;
    }

    private static final class LazyHolder{
        private static final LazyInnerSingleton LSZY = new LazyInnerSingleton();
    }
}

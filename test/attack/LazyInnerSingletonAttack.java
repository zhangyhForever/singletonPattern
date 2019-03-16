package attack;

import com.forever.lazy.LazyInnerSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerSingletonAttack {

    public static void main(String[] args) {
        Class clazz = LazyInnerSingleton.class;
        try{
            Constructor lazyInnerConstructor = clazz.getDeclaredConstructor();
            lazyInnerConstructor.setAccessible(true);

            LazyInnerSingleton o1 = (LazyInnerSingleton)lazyInnerConstructor.newInstance();
            LazyInnerSingleton o2 = LazyInnerSingleton.getInstance();

            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1==o2);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

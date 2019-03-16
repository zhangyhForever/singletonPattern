package attack;

import com.forever.hungry.HungrySingleton;

import java.lang.reflect.Constructor;

public class singletonAttack {

    public static void main(String[] args) {
        Class clazz = HungrySingleton.class;
        try{
            Constructor SingletonConstructor = clazz.getDeclaredConstructor(null);
            SingletonConstructor.setAccessible(true);
            HungrySingleton o1 = (HungrySingleton)SingletonConstructor.newInstance();
            HungrySingleton o2 = (HungrySingleton)SingletonConstructor.newInstance();

            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1==o2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

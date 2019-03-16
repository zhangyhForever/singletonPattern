package attack;

import com.forever.register.EnumSingleton;
import com.forever.seriable.SeriableSingleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class SeriableSingletonAttack {

    public static void main(String[] args) {
//        SeriableSingleton o1 = SeriableSingleton.getInstance();

//        EnumSingleton o1 = EnumSingleton.getInstance();
//        o1.setData(new Object());
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        try{
//            fos = new FileOutputStream("SeriableSingleton.obj");
//            oos = new ObjectOutputStream(fos);
//            oos.writeObject(o1);
//
//            fis = new FileInputStream("SeriableSingleton.obj");
//            ois = new ObjectInputStream(fis);
////            SeriableSingleton o = (SeriableSingleton)ois.readObject();
//            EnumSingleton o = (EnumSingleton)ois.readObject();
//            System.out.println(o.getData());
//            System.out.println(o1.getData());
//            System.out.println(o.getData()==o1.getData());
//        } catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            try {
//                if(fos != null){
//                    fos.close();
//                }
//                if(oos != null){
//                    oos.close();
//                }
//                if(fis != null){
//                    fis.close();
//                }
//                if(ois != null){
//                    ois.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }

        Class clazz = EnumSingleton.class;
        try{
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton obj = (EnumSingleton)c.newInstance("zhang",666);
            System.out.println(obj);
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}

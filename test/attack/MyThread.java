package attack;

import com.forever.lazy.LazyDoubleCheckSingleton;

public class MyThread implements Runnable{
    @Override
    public void run() {
        LazyDoubleCheckSingleton s = LazyDoubleCheckSingleton.getInstance();

        System.out.println(Thread.currentThread().getName()+"===="+s);
    }
}

import com.forever.lazy.LazyDoubleCheckSingleton;

public class LazySingletonTest {
    public static void main(String[] args) {
        LazyDoubleCheckSingleton lazy = LazyDoubleCheckSingleton.getInstance();
        LazyDoubleCheckSingleton lazy2 = LazyDoubleCheckSingleton.getInstance();

        System.out.println(lazy);
        System.out.println(lazy2);

        System.out.println(lazy==lazy2);
    }
}

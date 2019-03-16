import com.forever.hungry.HungrySingleton;

public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton s1 = HungrySingleton.getInstance();
        HungrySingleton s2 = HungrySingleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}

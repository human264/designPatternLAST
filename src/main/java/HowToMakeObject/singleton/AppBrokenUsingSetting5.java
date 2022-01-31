package HowToMakeObject.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppBrokenUsingSetting5 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings5 settings = Settings5.getInstance();

        //Replaction 사용
        Constructor<Settings5> declaredConstructor = Settings5.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings5 settings1 = declaredConstructor.newInstance();

        System.out.println(settings == settings1);
    }
}

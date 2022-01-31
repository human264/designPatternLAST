package HowToMakeObject.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class AppEnum {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings5Serialize settings = Settings5Serialize.getInstance();
        Settings5Serialize settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings5Serialize) in.readObject();
        }

        System.out.println(settings == settings1);


    }
}

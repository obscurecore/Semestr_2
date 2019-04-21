import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class SuperBestAwesomeFramework {
    public static <T> List<T> getMany(Class<T> aClass, int count) {
        List<T> list = new ArrayList<>();
        try {
            for (int i = 0; i < count; i++) {
                T newObj = aClass.newInstance();
                list.add(newObj);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return list;
    }


    public static <T> List<SimpleStudent> getMany(Class<T> aClass, int count, Object... params) throws NoSuchFieldException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        Class<?> c = Class.forName("aClass");
        List<SimpleStudent> list = new ArrayList<>();
        Constructor<?> cons = null;
        cons = c.getConstructor(String.class, Integer.class);
        SimpleStudent object = null;

        for (int i = 0; i < count; i++) {
            object = (SimpleStudent) cons.newInstance(params[0],params[1]);
            list.add((SimpleStudent) object);

        }
        return list;
    }
}

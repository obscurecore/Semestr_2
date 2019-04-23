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
// case when aclass has const with 2 params
/*
        Class<?> c = Class.forName("aClass");
        SimpleStudent []arr = new SimpleStudent[100];

        List<SimpleStudent> list = new ArrayList<>();
        Constructor<?> cons = null;
        cons = c.getConstructor(String.class, Integer.class);

        for (int i = 0; i < count; i++) {
            SimpleStudent arr[i] = null;

            arr[i] = (SimpleStudent) cons.newInstance(params[0],params[1]);
            list.add((SimpleStudent) arr[i]);

        }
        */


        //Case when aclass has const with only 1 params and the field will be open to set if 0 params so implements as close field
        Class<?> c = aClass;
        SimpleStudent[] arr = new SimpleStudent[100];
        List<SimpleStudent> list = new ArrayList<>();
        Constructor<?> cons = null;

        cons = c.getConstructor(String.class);
        Field f = c.getDeclaredField("age");
        f.setAccessible(true);
        for (int i = 0; i < count; i++) {
            arr[i] = null;
            arr[i] = (SimpleStudent) cons.newInstance(params[0]);
            f.set(arr[i], params[1]);

            list.add((SimpleStudent) arr[i]);

        }
        return list;
    }

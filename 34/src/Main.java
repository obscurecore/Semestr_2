import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException, NoSuchFieldException {
        List<SimpleStudent> list =
                SuperBestAwesomeFramework.getMany(SimpleStudent.class, 100 , "John",18);




    }
}
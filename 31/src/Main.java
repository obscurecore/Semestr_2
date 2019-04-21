import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
    }

    public static class Mystream {
        public static <T, R> List<R> map(List<T> elements, Function<T, R> mappingFunction) {
            List<R> list = new ArrayList<>();
            for (T elem : elements) {
                list.add(mappingFunction.apply(elem));
            }
            return list;
        }
        public static <E> List<E> filter(List<E> elements, Predicate<E> filter) {
            List<E> list = new ArrayList<>();
            for (E element : elements) {
                if (filter.test(element)) {
                    list.add(element);
                }
            }
            return list;
        }
    }
    public static <E> void forEach(List<E> elements, Consumer<E> consumer) {
        for (E elem : elements) {
            consumer.accept(elem);
        }
    }
}

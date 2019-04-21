import java.lang.reflect.Array;
import java.util.Arrays;

//обрабатывает массив строк
public class TextProcessor {
    private String[] strings;

    public TextProcessor(String[] strings) {
        this.strings = strings;
    }

    //обрабатывает единым образом каждую строку массива
    public void process(TextProcessingRule rule) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = rule.process(strings[i]);
            strings[i+1] = rule.process(strings[i+1]);
        }
    }

    void show() {
        System.out.println(Arrays.toString(strings));
    }
}
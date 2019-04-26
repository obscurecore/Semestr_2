package First;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static  Map<String,Integer> mMap = new HashMap<String, Integer>();
    public  static ArrayList arr = new ArrayList();


    public static void main(String[] args) throws FileNotFoundException {
       // Predicate<String> pred = ((String s)-> s.charAt(0)!= "q");
        List<String> f  =test((String s)-> s.length()>2);

        Scanner in = new Scanner(new File("aaa.txt"));
        while (in.hasNext()) {
            if (!in.equals(' ')) {
                String a = in.nextLine();
                arr.add(a);
            }
            in.close();

        }
    }
        public static ArrayList<String> test(Predicate<String> btf){
        ArrayList ar1 = new ArrayList();
        ArrayList ar2 = new ArrayList();
            ArrayList aee = new ArrayList();
            //aee = nums.stream().filter(btf).forEach(System.out::println);
            aee = (ArrayList) Main.arr.stream().filter(btf).collect(Collectors.toList());
            for (int i = 0; i < aee.size(); i++) {
                if(Main.mMap.get(aee.get(i))!=null) {
                    int cnt = Main.mMap.get(aee.get(i));
                    Main.mMap.put((String) aee.get(i), ++cnt);
                }
                else Main.mMap.put((String) aee.get(i),1);
            }
            Map<String, Integer> map2 = Main.mMap.entrySet().stream()
                    .filter(e -> e.getValue() ==1)
                    .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
// словарь уникальных ключей
            Map<String,Integer> map3 = Main.mMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
// сортировка словаря



            //Метод должен вернуть список уникальных (без повторений) слов из текстового файла words.txt
            for (String key : map2.keySet()) {
                ar1.add(key);
            }
            //Слова в списке должны быть отсортированы в порядке уменьшения частоты встречаемости слова в тексте.
            for (String key : map3.keySet()) {
                ar2.add(key);
            }
            return  ar1;

    }
}

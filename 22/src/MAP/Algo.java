package MAP;

import java.util.Scanner;

public class Algo {
    public void al() {
        Map<String, Integer> map = new SimpleMap<>();
/*
        map.put("Каренин", 10);
        map.put("дом", 16);
        System.out.println(map.get("дом"));
        */
        String b = "Привет Привет КЕК";

        String s[] = b.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(map.get(s[i])!=null) {
                int cnt = map.get(s[i]);
                map.put(s[i], ++cnt);
            }
            else map.put(s[i],1);
        }
        ((SimpleMap<String, Integer>) map).print(map,"KEK");
        System.out.println("COUNT"+map.get("Привет"));
    }
}

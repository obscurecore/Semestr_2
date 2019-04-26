package Second;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        PC pc1 = new PC(1,"AMD","Amd", "Samsung");
        PC pc2 = new PC(2,"Intel","Nvidia", "Samsung");
        PC pc3 = new PC(3,"Celeron","Nvidia", "Samsung");
        PC pc4 = new PC(4,"AMD raz","Nvidia", "Samsung");
        PC pc5 = new PC(5,"Intel i7 K","Amd", "Samsung");


        STOREPC poq = new STOREPC();
        poq.add(pc1);
        poq.add(pc2);
        poq.add(pc3);
        poq.add(pc4);
        poq.add(pc5);



        Comparator<PC> comp = (PC s1, PC s2) -> s2.id - s1.id;

        System.out.println(poq.top10(comp, 10).toString());
    }
}

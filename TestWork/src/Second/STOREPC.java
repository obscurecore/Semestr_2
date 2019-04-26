package Second;

import java.util.ArrayList;
import java.util.Comparator;

public class STOREPC {
    ArrayList<PC> listT = new ArrayList<>();
    public void add(PC pc) {
        listT.add(pc);
    }

    public ArrayList<PC> top10(Comparator<PC> comp, int n) {
        if (n >= listT.size()) {
            throw new IndexOutOfBoundsException("OOPS :/");
        }
        listT.sort(comp);
        ArrayList<PC> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newList.add(listT.get(i));
        }
        return newList;
    }
}

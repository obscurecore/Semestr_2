import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public  class  Main1{
    public static void main(String[] args) {
        Pup a1 = new Pup(120, "aa", "cc");
        Pup a2 = new Pup(101, "aa", "cc");
        List<Pup> lis = new ArrayList<>();
        lis.add(a1);
        lis.add(a2);
/*
        Collections.sort(lis, new Comparator<Pup>(){
            public int compare(Pup p1, Pup p2){
                    int sa = (int)p1.getID();
                    int sb = (int)p2.getID();
                    int v = Integer.compare(sa,sb);
                    return v;
                }
        });
*/
        Collections.sort(lis, (o1, o2) -> o1.getID() - o2.getID());

        for (int i = 0; i <lis.size() ; i++) {
            System.out.println(lis.get(i).getID());
        }
/*
        Comparator<Pup> c = new ByNumCOmp();
        Comparator<Pup> id =
                (o1, o2) -> o1.getID() - o2.getID();
        /*
        PlayList playList = new PlayList(10, c);
        playList.add(a1);
        playList.add(a2);
        playList.add(a3);
        playList.add(a4);
        playList.show();
        getDuration() - o2.getDuration();
        */
    }
}
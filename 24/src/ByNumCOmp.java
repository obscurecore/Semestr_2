import java.util.Comparator;

public class ByNumCOmp implements Comparator<Pup> {
    @Override
    public int compare(Pup o1, Pup o2) {
        return o1.getID() - o2.getID();

    }
}
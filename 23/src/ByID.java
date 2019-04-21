import java.util.Comparator;

public class ByID implements Comparator<Pup> {
    @Override
    public int compare(Pup o1, Pup o2) {
        return o1.getId() - o2.getId();
    }
}
import java.util.Comparator;

public class ByFN implements Comparator<Pup> {
    @Override
    public int compare(Pup o1, Pup o2) {
        String title1 = o1.getFN();
        String title2 = o2.getFN();

        return title1.compareTo(title2);
    }
}
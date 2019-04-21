public class Main {
    public static void main(String[] args) {
        Pup p1 = new Pup();
        Pup p2 = new Pup();
        p2.setId(1);
        p1.setId(2);
        p1.setFN("sas");
        p1.setSN("qw");
        ListP list = new ListP(10, new ByID() );
        list.add(p1);
        list.add(p2);
        list.view();

    }
}
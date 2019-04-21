public class Pup implements Comparable<Pup> {
    private  int id;
    private String FN;
    private String SN;





    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFN(String FN) {
        this.FN = FN;
    }

    public String getFN() {
        return FN;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String q) {
        this.SN = q;
    }

    @Override
    public int compareTo(Pup o) {
        return id - o.id;
    }
}
public class Pup implements Comparable<Pup> {
    public int ID;
    public String FN;
    public String SN;

    public Pup(int ID, String FN, String SN) {
        this.ID = ID;
        this.FN = FN;
        this.SN = SN;
    }
    @Override
    public int compareTo(Pup o) {
        return ID - o.ID;
    }

    public int getID() {
        return ID;
    }

    public String getFN() {
        return FN;
    }

    public String getSN() {
        return SN;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFN(String FN) {
        this.FN = FN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }
}

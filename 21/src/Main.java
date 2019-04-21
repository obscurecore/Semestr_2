import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        PlayList pl = new PlayList(5);
        AudioTracks a1 = new AudioTracks(10, "6", "6");
        AudioTracks a2 = new AudioTracks(6, "6", "6");


        pl.add(a1);
        pl.add(a2);

        pl.view();
    }
}

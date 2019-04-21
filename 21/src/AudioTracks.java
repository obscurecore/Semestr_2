public class AudioTracks implements Comparable<AudioTracks> {
    int duration;
    String title;
    String author;

    public AudioTracks(int i, String s, String s1) {
        duration = i;
        title = s;
        author = s1;
    }

    @Override
    public int compareTo(AudioTracks o) {
//        return duration - o.duration;//сравнение по продолжительности

        //сравнение сначала по продолжительности, а если совпадает, то по имени
        int d = duration - o.duration;
        if (d != 0) {
            return d;
        } else {
            return title.compareTo(o.title);
        }
    }
}

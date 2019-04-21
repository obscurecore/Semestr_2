import javax.lang.model.element.Element;
import java.util.Arrays;
import java.util.List;

public class PlayList {
    //массив упорядоченных треков
    AudioTracks[] listOfTracks;
    int n = 5;

    public PlayList(int size) {
        this.listOfTracks = new AudioTracks[size];
    }


    //вставляет новый аудиотрек в нужное место согласно порядку
    public void add(AudioTracks track) {
        //System.out.println(Arrays.toString(new int[]{listOfTracks.length}));
        for (int i = 0; i < n-1; i++) {
            if(listOfTracks[i]!=null){
                if (track.compareTo(listOfTracks[i]) < 0) {
                AudioTracks qw = listOfTracks[i];
                listOfTracks[i] = track;
                listOfTracks[i+1]=qw;
                break;
            }

            else {
                listOfTracks[i+1]=track;
            }
            }
            if (listOfTracks[0] == null) {
                listOfTracks[0]=track;
            }
        }



        //n++;
    }
    public  void view (){
        for (int i = 0; i <listOfTracks.length ; i++) {
            if (listOfTracks[i]!=null) {
                System.out.println(listOfTracks[i].duration);
            }
        }
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FIle<E> {
    public static int p = 0;
    //private final String FILE = "src\\SmoothSort\\smooth.txt";
    public int lenght;

    public FIle(int lenght) {
        this.lenght = lenght;
    }

    void GEneration() throws IOException {


        for ( p = 0; p < lenght; p++) {
            int arr[] = el();

            File file = new File(p + "file.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            for (int i = 0; i < arr.length; i++) {
                fileWriter.write(arr[i] + "\n");
            }
            fileWriter.close();
        }

    }



    public int []   read(int p) {
        ArrayList<Integer> list = new ArrayList();

        try {

            File file = new File(p + "file.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        int[] arr = list.stream().mapToInt(i->i).toArray();
        return  arr;
    }
/*
    public int readFromIndex(int i) {
        return arr[i];
    }

*/


/*

        InputStream input = new FileInputStream("file.txt");
        int size = input.available();

        for (int j = 0; j < size; j++) {
            System.out.print((char) input.read() + " "); // Чтение текстового файла посимвольно
        }
        input.close();
*/


    int[] el() {
        Random random = new Random();
        int min = 100;
        int max = 100000;
        int diff = max - min;
        int p = random.nextInt(diff + 1);
        p += min;
        int dist = FIle.p*100;
        if(FIle.p==0){
            dist=50;
        }
        int arr[] = new int[dist];
        for (int i = 0; i < (dist); i++) {
            int o = random.nextInt(diff + 1);
            o += min;
            arr[i] = random.nextInt(o);
        }
        return arr;
    }

}

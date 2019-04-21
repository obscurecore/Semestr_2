import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public  static  int start ;
    public  static int end;

    public static List<Thread> mThreadList;

    public static int[] array = new int[10];
    public static int sum =0;
    public static  int n =10;
    public  static int[] arr = new int[n];
    public  static  int st = Main.array.length/n;

    public static void main(String[] args) {



        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int k =0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= k;
            k+=st;

        }
        RunUnit.sm(10);

    }
}

class RunUnit extends Thread {


    public static void sm(int n){
    Main.mThreadList = new ArrayList<Thread>();


     for (int i = 0; i < n; i++) {
        Main.mThreadList.add(new Thread() {



            public void run() {
                int total = 0;


                    Main.end = Main.start+Main.st;
                    for (int i = Main.start; i < Main.end; i++) {
                        total += Main.array[i];
                    }
                    Main.sum = total;


                    System.out.println("Result " + this.getName() + " = " + total);

            }
        });
     }
        for (int i = 0; i < n; i++) {
            Main. start = Main.arr[i];
            Main.mThreadList.get(i).run();

     }

    }
}


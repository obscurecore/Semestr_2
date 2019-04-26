package Third;

import java.util.Arrays;

public class Main {
    public  static  int i=0;
   public  static  int[] myList = {1, 2, 3, 4};// пусть это файл 1

    public  static  int[] myList2 = new  int[Main.myList.length];// промежуточный массив где потоки обмениваются
    public  static  int[] myList3 = new  int[Main.myList.length];// файл 2


    //public static int [] arr = new int{0,1,2,3,4,5,6,7,8,9};
//public static  int[] arr2 = new int[arr.length];
    public static void main(String[] args) {
        /*
        Product p = new Product();
        Consumer consumer = new Consumer(Main.arr);
        Producer producer = new Producer(Main.arr);
        consumer.start();
        producer.start();
        */
        PRod f = new PRod();
        t2 f2 = new t2();
        for (i = 0; i <Main.myList.length ; i++) {
            f.run();
            f2.run();
        }
        System.out.println(Arrays.toString(Main.myList3));

    }
}


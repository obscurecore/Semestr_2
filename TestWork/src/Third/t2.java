package Third;
public class t2 implements  Runnable{
    @Override
    public void run() {
        int index = Main.i;
        System.out.println("INDEX t2"+index);

        Main.myList3[index]= Main.myList2[index];
    }
}
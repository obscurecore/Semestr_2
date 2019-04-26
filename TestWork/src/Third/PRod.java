package Third;


public class PRod implements Runnable {
    @Override
    public void run() {
        int index = Main.i;
        Main.myList2[index]= Main.myList[index];
        System.out.println("mylist"+Main.myList[index]);
    }
}
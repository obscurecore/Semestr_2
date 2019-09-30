import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Threads implements Runnable {
    Lock lc = new ReentrantLock();
    int j;
    String[] a;

    public Threads(String[] a, int i) {
        this.j = i;
        this.a = a;
    }

    public  void  write() throws IOException {
        String XML_URI = a[j];

        ReadableByteChannel readChannel= Channels.newChannel(new URL(a[j]).openStream());
        FileOutputStream fileOS = null;
        try {
            fileOS = new FileOutputStream(j + "file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        FileChannel writeChannel = fileOS.getChannel();
        try {
            writeChannel.transferFrom(readChannel, 0, Long.MAX_VALUE);        } catch (IOException e) {
            e.printStackTrace();
        }
        readChannel.close();
        writeChannel.close();
        
    }


    @Override
    public void run() {
        lc.lock();
        try {
            write();
        } catch (IOException e) {
            e.printStackTrace();
        }
        lc.unlock();
    }
}


import javax.xml.catalog.CatalogFeatures;
import java.awt.*;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) throws Exception {
        String [] a = {"http://www.w3schools.com/xsl/books.xml"};
        FIle file= new FIle(args.length);
        file.GEneration();
        ThreadPool Pool = new ThreadPool.Builder(args).setN(2).build();
        Pool.GPool();

    }
}

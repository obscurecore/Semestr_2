import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPool {
    ExecutorService executor;
    public int coreAmount;

    private String[] a;
    int overrun = 0;
    int maxWorkCount = a.length;

    private ThreadPool(Builder builder) {
        coreAmount = builder.n;
        this.a = builder.a;
    }

    public void GPool() throws Exception {
        executor = new ThreadPoolExecutor(coreAmount, coreAmount + overrun, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(maxWorkCount));
        for (int j = 0; j < a.length; j++) {
            executor.submit(new Threads (a, j));
        }
        executor.shutdown();
    }

    static class Builder {
        private int n;
        private String[] a;

        public Builder(String[] a) {
            this.a = a;
        }

        public Builder setN(int n) {
            this.n = n;
            return this;
        }

        public ThreadPool build() {
            return new ThreadPool(this);

        }
    }


}

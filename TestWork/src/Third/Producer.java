/*package Third;

public class Producer extends Thread {
    private Product product;

    public Producer(int[] product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i <Main.arr.length ; i++) {
            synchronized (product) {
                while (!product.isConsumed()) {
                    System.out.println("Спросили, потреблен ли");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                }
                product.produce();
                System.out.println("Произвел");
                product.notify();
            }
        }
    }
}*/
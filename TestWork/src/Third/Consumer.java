/*package Third;

public class Consumer extends Thread {
    private Product product;

    public Consumer(int[] product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i <Main.arr.length ; i++) {
            synchronized (product) {
                while (!product.isProduced()) {
                    System.out.println("Cпросили, произведен ли");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                }
                product.consume();
                System.out.println("Потребил");
                product.notify();
            }
        }
    }
}
*/
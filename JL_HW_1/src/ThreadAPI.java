public interface ThreadAPI<T> extends Runnable {

    @Override
    void run();

    T getThred();
}

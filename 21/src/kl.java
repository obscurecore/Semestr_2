class Deque {
    int size;
    int head;
    int tail;
    int[] data;

    Deque(int size) {
        data = new int[this.size = size];
    }


    void pushF(int val) {
        data[head] = val;
        if (--head < 0)
            head = size - 1;
    }

    int popF() {
        if (++head == size)
            head = 0;
        return data[head];
    }

    boolean isEmpty() {
        return head == tail;
    }

    void pushB(int val) {
        if (++tail == size)
            tail = 0;
        data[tail] = val;
    }


    int popB() {
        int q = data[tail];
        if (--tail < 0)
            tail = size - 1;
        return q;
    }

}
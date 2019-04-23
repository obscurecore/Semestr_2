package QUEUE;

class Queue
{
    int f, l, size;
    int  capacity;
    int array[];

    public Queue(int capacity) {
        this.capacity = capacity;
        f = this.size = 0;
        l = capacity - 1;
        array = new int[this.capacity];

    }

    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void put( int item) {
        if (isFull(this))
            return;
        this.l = (this.l + 1)%this.capacity;
        this.array[this.l] = item;
        this.size = this.size + 1;
    }


    int get()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.array[this.f];
        this.f = (this.f + 1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    int first()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.f];
    }

    // method to get last of queue
    int last() {
        if (!isEmpty(this)) {
            return this.array[this.l];
        } else {
            return Integer.MIN_VALUE;
        }
    }


}



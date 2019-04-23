package MAP;

public class SimpleMap<K, V> implements Map<K, V> {
    private static final int SIZE = 2;
    private int capacity ;
    private static final double EXTENSION_COEF = 1.5;

    private Entry[] entries;
    private int count;
    public void  print(Map al,String str){

        System.out.println(al.get(str));

    }


    public SimpleMap() {
        this.entries = new Entry[SIZE];
        System.out.println(entries.length);
        this.count = 0;
        this.capacity = SIZE;
    }

    public void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        Entry[] newElements = new Entry[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = entries[i];
        }
        capacity = newCapacity;
        entries = newElements;
    }



    @Override
    public void put(K key, V value) {
        int cnt = 1;
        if (capacity == count) {
            grow();
        }
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value = value;
                return;
            }
        }
        System.out.println("CNT"+count+"KEy="+key+"Value"+ value);
        System.out.println(entries.length);
        entries[count++] = new Entry(key, value);
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                return (V) entries[i].value;
            }
        }
        return null;
    }

    class Entry<I, E> {
        I key;
        E value;

        public Entry(I key, E value) {
            this.key = key;
            this.value = value;
        }
    }
}

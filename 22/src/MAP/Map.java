package MAP;

public interface Map<K, V> {
    void put(K key, V value);
   // void grow();
    V get(K key);
}


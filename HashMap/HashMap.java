package HashMap;

import java.util.ArrayList;


/**
 * This is HashMap data structure . It uses generic data type and hashing function to convert given key into index of given capacity.
 * @author Shoyeb Ansari
 */
public class HashMap<K, V> {
    public static final int MAX_SIZE = 16;

    private class Entry<K, V> {
        K key;
        V value;
        int hashCode;
        Entry(K ky, V val, int hc) {
            this.key = ky;
            this.value = val;
            this.hashCode = hc;
        }
    }
    
    private int sz;
    private int capacity;
    public ArrayList<ArrayList<Entry<K, V>>> data;
    
    public HashMap() {
        this.sz = 0;
        this.capacity = MAX_SIZE;
        this.data = new ArrayList<>();

        for (int i = 0; i < capacity; i++) {
            data.add(new ArrayList<Entry<K, V>>());
        }
    }
    
    private int hash(K key) {
        return key.hashCode() % capacity;
    }
    public void insert(K k, V v) {
        int idx = hash(k);
        Entry newEntry = new Entry<K,V>(k, v, idx);
        for(int i = 0; i < data.get(idx).size(); i++) {
            if(data.get(idx).get(i).key == k) {
                // data.get(idx).get(i) = new_entry;
            }
        }
    }
}
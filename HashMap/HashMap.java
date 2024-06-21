package HashMap;

import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 * This is HashMap data structure . It uses generic data type and hashing function to convert given key into index of given capacity.
 * @author Shoyeb Ansari
 */
public class HashMap<K, V> {
    public static final int MAX_SIZE = 16;
    public static final double MAX_THRESHOLD = 0.5;

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
        return key.hashCode();
    }

    private int getIndex(int hc) {
        return (hc % capacity + capacity) % capacity; 
    }

    private void resize() {
        int new_capacity = 2 * capacity;

        ArrayList<ArrayList<Entry<K, V>>> new_data = new ArrayList<>();
        for(int i = 0; i < new_capacity; i++) {
            new_data.add(new ArrayList<Entry<K, V>>());
        }

        for(int i = 0; i < capacity; i++) {
            for(Entry<K, V> entry: data.get(i)) {
                int new_index = getIndex(entry.hashCode % new_capacity);
                new_data.get(new_index).add(entry);
            }
        }
        data = new_data;
        capacity = new_capacity;
    }

    public void insert(K k, V v) {
        if((double) sz / capacity > MAX_THRESHOLD) {
            this.resize();
        }

        int idx = getIndex(hash(k));
        Entry<K, V> newEntry = new Entry<K,V>(k, v, idx);
        
        for(Entry<K, V> entry: data.get(idx)) {
            if(entry.key == k) {
                entry.value = v;
                return;
            }
        }
        data.get(idx).add(newEntry);
        sz++;   
    }

    public int size() {
        return sz;
    }

    boolean empty() {
        return (sz == 0);
    }

    boolean contains(K key) {
        int idx = getIndex(hash(key));
        for(int i = 0; i < data.get(i).size(); i++) {
            if(data.get(idx).get(i).key == key) {
                return true;
            }
        }
        return false;
    }

    void delKey(K key) {
        int idx = getIndex(hash(key));
        for(int i = 0; i < data.get(idx).size(); i++) {
            if(data.get(idx).get(i).key == key) {
                data.get(idx).remove(i);
            }
        }
        throw new NoSuchElementException("Key not found: " + key);
    }

    V get(K key) {
        int idx = getIndex(hash(key));
        for(int i = 0; i < data.get(idx).size(); i++) {
            if(data.get(idx).get(i).key == key) {
                return data.get(idx).get(i).value;
            }
        }
        return null;
    }
    
}
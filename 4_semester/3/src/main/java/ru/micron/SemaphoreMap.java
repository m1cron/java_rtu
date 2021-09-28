package ru.micron;

import lombok.Data;

import java.util.*;
import java.util.concurrent.Semaphore;

@Data
public class SemaphoreMap<K,V> implements Map<K, V> {

    private final Map<K, V> map = new HashMap<>();
    private final Semaphore semaphore = new Semaphore(1);

    @Override
    public int size() {
        int value = 0;
        try {
            semaphore.acquire();
            value = map.size();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        boolean value = false;
        try {
            semaphore.acquire();
            value = map.isEmpty();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean containsKey(Object key) {
        boolean tmp = false;
        try {
            semaphore.acquire();
            tmp = map.containsKey(key);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return tmp;
    }

    @Override
    public boolean containsValue(Object value) {
        boolean tmp = false;
        try {
            semaphore.acquire();
            tmp = map.containsValue(value);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return tmp;
    }

    @Override
    public V get(Object key) {
        V tmp = null;
        try {
            semaphore.acquire();
            tmp = map.get(key);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return tmp;
    }

    @Override
    public V put(K key, V value) {
        V tmp = null;
        try {
            semaphore.acquire();
            tmp = map.put(key, value);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return tmp;
    }

    @Override
    public V remove(Object key) {
        V tmp = null;
        try {
            semaphore.acquire();
            tmp = map.remove(key);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return tmp;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        try {
            semaphore.acquire();
            map.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            map.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Set<K> keySet() {
        Set<K> keySet = new HashSet<>();
        try {
            semaphore.acquire();
            keySet = map.keySet();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return keySet;
    }

    @Override
    public Collection<V> values() {
        Collection<V> values = null;
        try {
            semaphore.acquire();
            values = map.values();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return values;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySet = new HashSet<>();
        try {
            semaphore.acquire();
            entrySet = map.entrySet();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return entrySet;
    }

}

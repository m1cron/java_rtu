package ru.micron;

import lombok.Data;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
public class LockSet<V> implements Set<V> {

    private final Set<V> map = new HashSet<>();
    private final Lock lock = new ReentrantLock();

    @Override
    public int size() {
        int size;
        lock.lock();
        size = map.size();
        lock.unlock();
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean size;
        lock.lock();
        size = map.isEmpty();
        lock.unlock();
        return size;
    }

    @Override
    public boolean contains(Object o) {
        boolean state;
        lock.lock();
        state = map.contains(o);
        lock.unlock();
        return state;
    }

    @Override
    public Iterator<V> iterator() {
        Iterator<V> iterator;
        lock.lock();
        iterator = map.iterator();
        lock.unlock();
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] toArray;
        lock.lock();
        toArray = map.toArray();
        lock.unlock();
        return toArray;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] toArray;
        lock.lock();
        toArray = map.toArray(a);
        lock.unlock();
        return (T[]) toArray;
    }

    @Override
    public boolean add(V v) {
        boolean add;
        lock.lock();
        add = map.add(v);
        lock.unlock();
        return add;
    }

    @Override
    public boolean remove(Object o) {
        boolean remove;
        lock.lock();
        remove = map.remove(o);
        lock.unlock();
        return remove;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean containsAll;
        lock.lock();
        containsAll = map.containsAll(c);
        lock.unlock();
        return containsAll;
    }

    @Override
    public boolean addAll(Collection<? extends V> c) {
        boolean addAll;
        lock.lock();
        addAll = map.addAll(c);
        lock.unlock();
        return addAll;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean retainAll;
        lock.lock();
        retainAll = map.retainAll(c);
        lock.unlock();
        return retainAll;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean removeAll;
        lock.lock();
        removeAll = map.removeAll(c);
        lock.unlock();
        return removeAll;
    }

    @Override
    public void clear() {
        lock.lock();
        map.clear();
        lock.unlock();
    }

}

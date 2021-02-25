package ru.micron;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static final Lock lock = new ReentrantLock();
    private static final Set<Integer> set = new HashSet<>();
    private static int i = 0;

    private static void add() {
        lock.lock();
        set.add(i++);
        lock.unlock();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread one = new Thread(Main::add);
        }
    }
}

package ru.micron;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        testSet();
    }

    public static void testSet(){
        Map<Integer, Integer> map = new SemaphoreMap<>();
        Runnable task1 = () -> {
            for(int i = 1; i < 25; i++){
                map.put(i, i);
            }
        };
        Runnable task2 = () -> {
            for (int i = 26; i < 51; i++){
                map.put(i, i);
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(map.toString());
    }
}

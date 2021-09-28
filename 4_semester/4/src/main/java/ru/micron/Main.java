package ru.micron;

public class Main  {
    public static void main(String[] args) {
        MyExecutorService executorService = new MyExecutorService(2);
        // MyExecutorService executorService = new MyExecutorService(1);
        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService.submit(() -> System.out.println("Start"));
    }
}
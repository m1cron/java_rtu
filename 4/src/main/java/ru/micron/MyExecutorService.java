package ru.micron;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutorService implements ExecutorService {

    public ExecutorService executors;

    public MyExecutorService(int n) {
        executors = Executors.newFixedThreadPool(n);
    }

    @Override
    public void shutdown() {
        executors.shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {
        return executors.shutdownNow();
    }

    @Override
    public boolean isShutdown() {
        return executors.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return executors.isTerminated();
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return executors.awaitTermination(timeout, unit);
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        return executors.submit(task);
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        return executors.submit(task, result);
    }

    @Override
    public Future<?> submit(Runnable task) {
        return executors.submit(task);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return executors.invokeAll(tasks);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return executors.invokeAll(tasks, timeout, unit);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return executors.invokeAny(tasks);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return executors.invokeAny(tasks, timeout, unit);
    }

    @Override
    public void execute(Runnable command) {
        executors.execute(command);
    }
}
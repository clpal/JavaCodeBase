package Genric;

public class SynchronizedExample {

    // Synchronized method
    public synchronized void synchronizedMethod(String threadName) {
        System.out.println(threadName + " entered synchronizedMethod.");
        try {
            // Simulating some work with thread sleeping
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " leaving synchronizedMethod.");
    }

    // Method containing a synchronized block
    public void methodWithSynchronizedBlock(String threadName) {
        System.out.println(threadName + " entered methodWithSynchronizedBlock.");

        // Synchronized block
        synchronized (this) {
            System.out.println(threadName + " entered synchronized block.");
            try {
                // Simulating some work with thread sleeping
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " leaving synchronized block.");
        }

        System.out.println(threadName + " leaving methodWithSynchronizedBlock.");
    }

    // Synchronized static method (synchronized at the class level)
    public static synchronized void synchronizedStaticMethod(String threadName) {
        System.out.println(threadName + " entered synchronizedStaticMethod.");
        try {
            // Simulating some work with thread sleeping
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " leaving synchronizedStaticMethod.");
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // Creating threads to test synchronization
        Thread thread1 = new Thread(() -> {
            example.synchronizedMethod("Thread 1");
            example.methodWithSynchronizedBlock("Thread 1");
            SynchronizedExample.synchronizedStaticMethod("Thread 1");
        });

        Thread thread2 = new Thread(() -> {
            example.synchronizedMethod("Thread 2");
            example.methodWithSynchronizedBlock("Thread 2");
            SynchronizedExample.synchronizedStaticMethod("Thread 2");
        });

        // Starting threads
        thread1.start();
        thread2.start();
    }

}

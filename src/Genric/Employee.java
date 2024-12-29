package Genric;

public class Employee {
// synchronized method
    public synchronized int sum(int[] arr) {

        int sum = 0;
        for (int element : arr)
            sum += element;

        return sum;
    }
//synchronized block
    public int  sum1(int[] arr) {
        synchronized (this) {
            int sum = 0;
            for (int element : arr)
                sum += element;

            return sum;
        }
    }
    // synchronized class level static method
    public    synchronized static int sum2(int[] arr) {

            int sum = 0;
            for (int element : arr)
                sum += element;

            return sum;
        }

}

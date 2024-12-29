package code_practice;

public class MulthithreadingTest {

    static int counter =1;
    static  int N;
    public void printOddNumber(){
        synchronized (this) {
            while (counter < N) {
                while (counter%2==1) {
             try {
                 wait();
             }
             catch ( InterruptedException e){
                 e.printStackTrace();
             }
                }
                System.out.println(counter + " ");
                counter ++;
                // notify to 2nd thread
                notify();
            }
        }
    }
    public void printEvenNumber(){
        synchronized (this){
            while (counter<N){
                while (counter%2==0){
                    try {
                        wait();
                    }
                    catch ( InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(counter + " ");
                counter ++;
                // notify to 2nd thread
                notify();
            }
        }
    }
    public static void main(String[] args) {
  N=10;
        MulthithreadingTest test= new MulthithreadingTest();
        Thread odd= new Thread(() -> {
            test.printOddNumber();

        });
        Thread even= new Thread(() -> {
            test.printEvenNumber();

        });
        odd.start();
        even.start();
    }
}

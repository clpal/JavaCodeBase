package Genric;

public class EmpoyeeMain {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Employee employee=new Employee();
       Thread thread= new Thread(new Runnable() {
           @Override
           public void run() {
         // int sum=     employee.sum1(arr);
          int sum=     Employee.sum2(arr);
               System.out.println(sum);
           }
       }){

        };
       thread.start();
    Thread thread1= new Thread(()->{
        //int sum=     employee.sum1(arr);
        int sum=     Employee.sum2(arr);
        System.out.println(sum);
     });
    thread1.start();
    Thread thread2= new Thread(()->{
        //int sum=     employee.sum1(arr);
        int sum=     Employee.sum2(arr);
        System.out.println(sum);

    });
    thread2.start();
    }


}

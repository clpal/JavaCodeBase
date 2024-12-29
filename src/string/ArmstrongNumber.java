package string;

public class ArmstrongNumber {
	  
	public static void main(String[] args) {
		int temp, total = 0;
		int num=153;
		 int number = num;

        // for (; number != 0; number /= 10) {
         //    temp = number % 10;
         //    total = total + temp * temp * temp;
        // }
         
         // 2nd logic while loop
          while(number>0) {
        	  temp = number % 10;
        	  total=total+ temp * temp *temp;
        	  number=number/10;
          }

         if (total == num) {
             System.out.println(num + " is an Armstrong number");
         } else {
             System.out.println(num + " is not an Armstrong number");
         }
         
         
     }

}

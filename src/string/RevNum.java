package string;

public class RevNum {
// % ---> reminder
// / --->divider
	public static void main(String[] args) {
	//recusrive(1234);
	//reverseInt();
		//whileloop();
	reverseIntforloop();
}

private static void recusrive(int number) {
       if(number<10) {
    	   System.out.print(number);
    	   return ;
       }
       else {
    	   System.out.print(number%10);
    	
    	   recusrive(number/10);
       }
	
}

private static void whileloop() {
	 int number =123;

	 int reverse = 0;
	   while(number>0)
	   {
		   int remainder =number%10; //3,2,1
		    reverse= reverse*10+ remainder ; //3,32,321
		    number =number /10; //12,1,0   
	   }
	   System.out.println(reverse);
		}
	private  static void reverseInt() {
		int num=1234;
		int rev=0;
		// while(num>0) {
		while(num!=0) {
			 int rem;
			   rem=num%10;// get module operator //4,3,2,1
			   rev=rev*10+rem;//4 ,43,432
			     num=num/10;//123,12,1   
		 }
		 System.out.println(rev);
	
	}
	private static void reverseIntforloop() {
		int rev=0;
		int num=456;
		//for (; num>0; num=num/10) {
			for (; num!=0; num/=10) {
			int rem=num%10;
			rev=rev*10+ rem;
			
		}
		System.out.print(rev);
		
	}
}

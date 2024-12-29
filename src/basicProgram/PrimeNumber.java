package basicProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		 
		boolean isPrime=true;
	 int num=29;
	 //System.out.println(num/2);
	  for (int i = 2; i <=num/2; i++) {//8 maximum divisible check
		  if(num%i==0) {
			   isPrime = false;
			   break;
		  }
		
	}
	  if (isPrime) {
		  System.out.println(num + " is a Prime Number");
	}
	  else {
		  System.out.println(num + " is not a Prime Number");
	  }
	}

}

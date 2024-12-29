package basicProgram;
// https://www.youtube.com/watch?v=h4TNEMjr96Y
//https://beginnersbook.com/2014/01/java-program-to-display-prime-numbers/
public class PrimeNumber1toN {

	public static void main(String[] args) {
		System.out.println("1 to 100 prime numbers");
		   String  primeNumbers = "";
		int num=100;
		for (int i = 2; i <= num; i++) {
			// int counter=0; 
			boolean isPrime=true;
			for (int j = 2; j <=i/2; j++) {
				if (i%j==0) {
					isPrime=false;
					//counter = counter + 1;
				}
				
			}
			
			if (isPrime) { 
				
				System.out.print(i + ",");
				
			}
			//System.out.println("total count Prime numbers : "+counter);
		}
		
	}

}

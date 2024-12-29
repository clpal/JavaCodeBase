package basicProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n=54321;
	int rem = 0;int rev=0;
		while(n>0) {
			rem=n%10;// remainder
			rev=rev*10 +rem;
			n=n/10; //divider
			
		}
		System.out.print(rev);

	}

}

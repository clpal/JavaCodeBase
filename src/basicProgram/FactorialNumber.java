package basicProgram;

public class FactorialNumber {

	public static void main(String[] args) {
		int n=-5;
 int value=fact1(n);
 System.out.print(value);
	}

	private static int  fact1(int n) {
		/*
		 * if( n<0 ) return n;
		 */
		 if( n==1 )
		return 1;
		return n*fact1(n-1);
	}

	private static int  fact(int n) {
		 if( n>=1 )
		return n*fact(n-1);
		 
		return 1;
	
		
	}
}

package recursion;

public class Fibonacci {
	
// 0,1,1,2,3,5,8,13,21,36....
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		//System.out.print(fib(n));
		// print fabonacci series
		for (int i = 0; i <= n; i++) {
			System.out.print(fib(i)+",");
			
		}
		

	}
static int fib(int n) {
	// base case
	/*if(n==0)return 0;
	else if(n==1) return 1;*/
	//  Optimize base case
	if(n==0 || n==1)
		return n;
	else return fib(n-1)+fib(n-2);
}
}

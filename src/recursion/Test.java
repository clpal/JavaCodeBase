package recursion;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(fact(-1));
	}
	

			static int fact(int n){
			// base condition
			 if(n==0 || n==1)
			return 1;
			 return n*fact(n-1);
			

			}
}

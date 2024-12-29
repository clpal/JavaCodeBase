package recursion;

public class Factorial {
// 0,1,2,3,4,5,6
	// 0 =1
	// 1=1
	// 2=2*1
	// 3=3*2*1
	// 4 =4*3*2*1
	// 5=5*4*3*2*1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(fact(5));
	}
  public static int fact(int n) {
	// base case 
	  /*if(n==0)
	return 1;
	  else if(n==1)return 1;*/
	//  Optimize base case
	  if(n==0 || n==1)return n;
	  // rec khud sabhal lega
	  else  return n*fact(n-1); 
	  
  }
}

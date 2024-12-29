package basicProgram;
// https://www.geeksforgeeks.org/java-fibonacci-series/
public class FabinacioSeries {
	
	public static void main(String[] args) {
		int N=10;
	for (int i = 0; i <N; i++) {
		//System.out.println(recusivefib(i) + " ");
		System.out.print(dynamicfab(i) + " ");
	}
		
		//iterativefab(N);
	

	}

	private static int  recusivefib(int n) {
		//if(n==0 || n==1)
		// base case 
			if(n<=1)
	return n;
			// recusive call
		return recusivefib(n-1)+ recusivefib(n-2);
		
		
		
		
	}
	private static void  iterativefab(int n) {
		int num1=0;int num2=1;
		 int counter =0;
		 while(counter<n) {
			 System.out.print(num1+" ");
			 int num3=num1+num2;
			            num1=num2;
			            num2=num3;
			            counter =counter+1;
			 
		 }
		
	}
	// Dynamic approaching
	private static int  dynamicfab(int n) {
		int f[]=new int [n+2];
		int i;
		f[0]=0;
		f[1]=1;
		for (i = 2; i <=n; i++) {
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
		
	}
}

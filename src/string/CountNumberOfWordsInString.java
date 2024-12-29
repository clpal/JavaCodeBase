package string;

public class CountNumberOfWordsInString {
	public static void main(String[] args) {
		method1();
		method2();
	}

	private static void method1() {
		final String str = "java developers guide";
		 String []strarray=str.split(" ");
		 System.out.println(strarray.length);
		
	}
	private static void method2() {
		final String str = "java developers guide";
		 String []words=str.split(" ");
		 int count=0;
		 for(String word:words) {
			 count ++;
		 }
		 System.out.print(count);
		
	}

}

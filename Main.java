package sample;

public class Main{
	public static int fibonacci(int A) {
		if(A==0) {
			return 0;
		}
		if(A==1) {
			return 1;
		}
		return fibonacci(A-1)+fibonacci(A-2);
		
	}
	public static void main(String[] args) {
		int A=2;
		int output=fibonacci(A);
		System.out.println(output);
		 A=9;
		output=fibonacci(A);
		System.out.println(output);
	}

}

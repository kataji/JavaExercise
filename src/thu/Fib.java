package thu;

import java.util.Scanner;

public class Fib {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		long a = 1; //
		long b = 1;	//
		
		for(int i=1; i<num; i++){
			b = a+b;
			a = b-a;
		}
		
		System.out.println(b);
		
		in.close();
	}

}

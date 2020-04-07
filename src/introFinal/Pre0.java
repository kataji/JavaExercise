package introFinal;

import java.util.Scanner;

public class Pre0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		num = Integer.numberOfLeadingZeros(num);
		System.out.println(num);
	}

}

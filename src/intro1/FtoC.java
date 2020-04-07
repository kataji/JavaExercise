package intro1;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double F = in.nextDouble();
		double C = (F - 32)*5/9;		
		System.out.println((int)C);
	}

}

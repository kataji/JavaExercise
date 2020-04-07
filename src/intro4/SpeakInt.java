package intro4;

import java.util.Scanner;

public class SpeakInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if(number < 0){
			number = -number;
			System.out.print("fu ");
		}
		
//		get Number_of_Digit
		int Number_of_Digit = 0;
		int n = number;
		do{
			n /= 10;
			Number_of_Digit ++;
		}while(n>0);
		
//		read the first digit of number
		int mask = (int)Math.pow(10, Number_of_Digit-1);
		boolean IsFirstDigit = true;
		while(mask > 0){
			int d = number / mask;
			if(IsFirstDigit){
				IsFirstDigit = false;
			}
			else{
				System.out.print(" ");
			}
			switch(d){
			case 1:
				System.out.print("yi");
				break;
			case 2:
				System.out.print("er");
				break;
			case 3:
				System.out.print("san");
				break;
			case 4:
				System.out.print("si");
				break;
			case 5:
				System.out.print("wu");
				break;
			case 6:
				System.out.print("liu");
				break;
			case 7:
				System.out.print("qi");
				break;
			case 8:
				System.out.print("ba");
				break;
			case 9:
				System.out.print("jiu");
				break;
			case 0:
				System.out.print("ling");
				break;
			}
			number %= mask;
			mask /=10;
		}
	}

}

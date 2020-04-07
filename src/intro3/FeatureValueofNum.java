package intro3;

import java.util.Scanner;

public class FeatureValueofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int digit;
		int position = 0;
		int sum = 0;
		do{
			digit = number%10;
			position = position + 1;
			if (digit % 2 == 0){
				if(position % 2 == 0){
					sum = sum + (int)Math.pow(2, position-1);
				}
			}
			else {
				if(position % 2 == 1){
					sum = sum + (int)Math.pow(2, position-1);
				}
			}
			number = number/10;
		}while(number > 0);
		System.out.println(sum);
	}

}

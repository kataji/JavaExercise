package intro3;

import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		int number = in.nextInt();
		while (number != -1){
			if(number%2 == 0){
				even = even + 1;
			}
			else {
				odd = odd + 1;
			}
			number = in.nextInt();
		}
		System.out.println(odd+ " "+ even);
	}

}

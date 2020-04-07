package intro7;

import java.util.Scanner;

public class Decom {
	public static int minFact(int num){
		int minfact = 1;
		int sqrt = (int)Math.sqrt(num);
		for(int i = 2; i<= sqrt; i++){
			if(num % i == 0){
				minfact = i;
				break;
			}
		}
		return minfact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.print(num+"=");
		boolean firstitem = true;
		int minfact = minFact(num);
		while(minfact != 1){
			if(firstitem == true){
				firstitem = false;
			}
			else {
				System.out.print("x");
			}
			System.out.print(minfact);
			num /= minfact;
			minfact = minFact(num);
		}
		if(firstitem == true){
			firstitem = false;
		}
		else {
			System.out.print("x");
		}
		System.out.print(num);
	}

}

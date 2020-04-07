package intro7;

import java.util.Scanner;

public class CompleteNum {
	public static boolean isCompNum(int num){
		boolean isCompNum;
		int sum = 0;
		for(int i = 1; i < num; i++){
			if(num % i == 0){
				sum += i;
			}
		}
		if(sum == num){
			isCompNum = true;
		}
		else{
			isCompNum = false;
		}
		return isCompNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		boolean firstitem = true;
		for(int i = n; i <= m; i++){
			if(isCompNum(i)){
				if(firstitem){
					firstitem = false;
				}
				else{
					System.out.print(" ");
				}
				System.out.print(i);
			}
		}
		if(firstitem)
			System.out.println("NIL");
	}

}

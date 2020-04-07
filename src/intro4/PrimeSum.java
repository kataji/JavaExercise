package intro4;

import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int count = 0;
		int num = 1;
		int sum = 0;
		while(count < m){
//			next number
			num++;
			
//			judge if number is prime
			boolean IsPrime = true;
			for (int i=2;i<=num/2;i++){
				if(num%i==0){
					IsPrime = false;
					break;
				}
			}
			
//			if is prime, 
			if(IsPrime){
				count++;
				if(count >= n){
					sum += num;
				}
			}
			
		}
		System.out.println(sum);
	}

}

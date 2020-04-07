package introAddi;

import java.util.Scanner;

public class HashShapeChess2 {
	
	public static boolean judge(int n, int sum){
		boolean gotResult = false;
		if(sum==0){
			System.out.println("O");
			gotResult = true;
		}
		else if(sum==n){
			System.out.println("X");
			gotResult = true;
		}
		return gotResult;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int status;
		int rowsum;
		int[] colsum = new int[n];
		int diagonal = 0;
		int backdiagonal = 0;
		
		for(int i=0; i<n; i++){
			rowsum = 0;
			for(int j=0; j<n; j++){
				status = in.nextInt();
				rowsum += status;
				colsum[j] += status;
				if(i==j)
					diagonal += status;
				if(i+j == n-1)
					backdiagonal += status;
				if(i==n-1){
					if(j==0 && judge(n, backdiagonal))
						return;					
					if(judge(n, colsum[j]))
						return;	
					if(j==n-1 && judge(n, diagonal))
						return;
				}
			}
			if(judge(n, rowsum))
				return;
		}
		System.out.println("NIL");
	}
}

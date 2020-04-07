package introAddi;

import java.util.Scanner;

public class HashShapeChess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] board = new int[n][n];
		int sum = 0;
		for(int i=0; i<board.length; i++){
			sum = 0;
			for(int j=0; j<board[i].length; j++){
				board[i][j] = in.nextInt();
				sum += board[i][j];
			}
			if(sum == 0 || sum == n)
				break;				
		}
		if(sum == n)
			System.out.println("X");
		else if(sum == 0)
			System.out.println("O");
		else{
			for(int j=0; j<board[0].length; j++){
				sum = 0;
				for(int i=0; i<board.length; i++)
					sum += board[i][j];
				if(sum == 0 || sum == n)
					break;
			}
			if(sum == n)
				System.out.println("X");
			else if(sum == 0)
				System.out.println("O");
			else{
				sum = 0;
				for(int i=0; i<board.length; i++)
					sum += board[i][i];
				if(sum == n)
					System.out.println("X");
				else if(sum == 0)
					System.out.println("O");
				else{
					sum = 0;
					for(int i=0; i<board.length; i++)
						sum += board[i][n-1-i];
					if(sum == n)
						System.out.println("X");
					else if(sum == 0)
						System.out.println("O");
					else
						System.out.println("NIL");
				}
			}
		}
		
	}
}

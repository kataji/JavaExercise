package intro5;

import java.util.Scanner;

public class PolyAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int exp;
		int fact;
		int[] poly = new int[101];
		
		do{
			exp = in.nextInt();
			fact = in.nextInt();
			poly[exp] = fact;
			
		}while(exp != 0);
		
		do{
			exp = in.nextInt();
			fact = in.nextInt();
			
			poly[exp] += fact;
			
		}while(exp != 0);
		
		boolean first_item = true;
		for(int i = poly.length - 1; i >=0; i--){
			if(poly[i] != 0 ){
				if(first_item == true){
					first_item = false;
				}
				
				else if(poly[i] > 0){
					System.out.print("+");
				}
				if(poly[i] != 1 || i == 0){
					System.out.print(poly[i]);
				}
				if(i > 0){
					System.out.print("x");
				}
				if(i > 1){
					System.out.print(i);
				}
			}
		}
		if(first_item == true)
			System.out.print(0);
	}

}

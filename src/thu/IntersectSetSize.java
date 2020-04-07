package thu;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectSetSize {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
			
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			set.add(in.nextInt());
		}
		
		int m = in.nextInt();
		int result = 0;
		for(int i=0; i<m; i++){
			if(set.contains(in.nextInt()))
				result++;
		}
		
//		int result = m+n-set.size();
		
		if (result != 0) 
			System.out.println(result);
		else
			System.out.println("None");	//
		
		in.close();
		
	}

}

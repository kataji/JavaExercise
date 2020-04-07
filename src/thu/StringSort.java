package thu;

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] strings = new String[Integer.getInteger(in.nextLine())];
		
		for(int i=0; i<strings.length; i++){
			String str = in.nextLine();
			
			int position = 0;
			for(int j=i-1; j>=0; j--){
				if(strings[j].compareTo(str)>0){ 
					strings[j+1] = strings[j];
				}
				else{
					position = j+1;	//
					break;
				}
			}
			strings[position] = str;
		}
		
		for(String str : strings){
			System.out.println(str);
		}
		
		in.close();
	}

}

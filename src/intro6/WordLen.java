package intro6;

import java.util.Scanner;

public class WordLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.substring(0, s.length()-1);
		boolean first_word = true;
		
		while(!s.isEmpty()){
			String sub;
			int i = s.indexOf(' ') ;
			if(i != -1 ){
				sub = s.substring(0, i);
				s = s.substring(i, s.length());
				s = s.trim();
			}
			else{
				sub = s;
				s = "";
			}
			if(first_word == true){
				first_word = false;
			}
			else {
				System.out.print(" ");
			}
			System.out.print(sub.length());
		}
	}

}

package intro6;

import java.util.Scanner;

public class WordLen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.substring(0, s.length()-1);
		String[] words = s.split(" ");
		
		boolean first_word = true;
		for (String word: words){
			int len = word.length();
			if(len>0){
				if(first_word == true){
					first_word = false;
				}
				else{
					System.out.print(" ");
				}
				System.out.print(len);
			}
		}
	}

}

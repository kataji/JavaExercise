package intro6;

import java.util.Scanner;

public class GPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int utc = -1;
		String s = in.nextLine();
		while(!s.equals("END")){
			String[] words = s.split(",");
			if(words[0].equals("$GPRMC") &&	words[2].equals("A")){
				int checkvalue = s.charAt(1);
				int starindex = s.indexOf('*');
				for(int i = 2; i<starindex; i++){
					checkvalue = checkvalue ^ s.charAt(i);				
				}
				checkvalue %= 65536;
				if(checkvalue == Integer.parseInt(s.substring(s.length()-2), 16)){
					utc = Integer.parseInt(words[1].substring(0, words[1].indexOf('.')));
				}
			}
			s = in.nextLine();
		}
		if(utc != -1){		
			int hr = (utc/10000 + 8)%24;
			int min = utc%10000/100;
			int sec = utc%100;
			System.out.printf("%02d:%02d:%02d", hr,min,sec);
		}
	}

}

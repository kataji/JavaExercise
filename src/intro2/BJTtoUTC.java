package intro2;

import java.util.Scanner;

public class BJTtoUTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		final int TimeDif = 800;
		final int WholeDay = 2400;
		int BJT = in.nextInt();
		int UTC = BJT-TimeDif;
		if(UTC < 0)
		{
			UTC = UTC + WholeDay;
		}
		System.out.println(UTC);
	}

}

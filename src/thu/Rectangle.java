package thu;

import java.util.Scanner;

class Rectangle {
	int height;
	int width;
	
	int getArea(){
		return height*width;
	}
	
	int getPerimeter(){
		return 2*(height+width);
	}

}

public class Main{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		rect.height = in.nextInt();
		rect.width = in.nextInt();
		
		int area = rect.getArea();
		int perimeter = rect.getPerimeter();
		
		System.out.println(area+" "+perimeter);
		in.close();
	}
	
}

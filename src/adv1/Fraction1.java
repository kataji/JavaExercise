package adv1;

import java.util.Scanner;

public class Fraction1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction {
	int a;
	int b;
	
//	构造一个a/b的分数。
	Fraction(int a, int b){
		int c = gcd(a, b);
		this.a = a/c;
		this.b = b/c;
	}

//	求最大公约数
	int gcd (int a, int b){
		int gcd;
		if(b == 0){
			gcd = a;
		}
		else{
			int c = a % b;
			while(c != 0){
				a = b;
				b = c;
				c = a % b;
			}
			gcd = b;
		}
		return gcd;
	}
	
//	将分数转换为double
	double toDouble(){
		return (double)a/b;
		
	}
    
//	将自己的分数和r的分数相加，产生一个新的Fraction的对象
	Fraction plus(Fraction r){
		Fraction ret = new Fraction(a*r.b+b*r.a, b*r.b);
		return ret;
	}
	
//	将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
	Fraction multiply(Fraction r){
		Fraction ret = new Fraction(a*r.a, b*r.b);
		return ret;
	}
	
//	将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。
	void print(){
		if(a % b == 0){
			System.out.println(a/b);
		}
		else{
			System.out.println(a+"/"+b);
		}
	}
}
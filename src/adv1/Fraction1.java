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
	
//	����һ��a/b�ķ�����
	Fraction(int a, int b){
		int c = gcd(a, b);
		this.a = a/c;
		this.b = b/c;
	}

//	�����Լ��
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
	
//	������ת��Ϊdouble
	double toDouble(){
		return (double)a/b;
		
	}
    
//	���Լ��ķ�����r�ķ�����ӣ�����һ���µ�Fraction�Ķ���
	Fraction plus(Fraction r){
		Fraction ret = new Fraction(a*r.b+b*r.a, b*r.b);
		return ret;
	}
	
//	���Լ��ķ�����r�ķ�����ˣ�����һ���µ�Fraction�Ķ���
	Fraction multiply(Fraction r){
		Fraction ret = new Fraction(a*r.a, b*r.b);
		return ret;
	}
	
//	���Լ��ԡ�����/��ĸ������ʽ�������׼����������лس����С�
	void print(){
		if(a % b == 0){
			System.out.println(a/b);
		}
		else{
			System.out.println(a+"/"+b);
		}
	}
}
// package TypeCasting;

public class Implicit {
//	widening : converting from smaller valued datatypes to bigger valued datatypes
	public static void main(String[]args) {
		int a = 5;
		double b = a;
		System.out.println(a + " " + b);
		
		float a1 = (float) 10.4;
		double b1 = a1;
		System.out.println(a1 + " " + b1);
		
		char a2 = 's';
		int b2 = a2;
		System.out.println(a2 + " " + b2);
	}
}

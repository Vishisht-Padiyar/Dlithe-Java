package pack2;

public class Subs {
	int sub(int a, int b) {
		System.out.println("Int o/p = " + (a-b));
		return a-b;
	}
	int sub(int a, int b, int c) {
		System.out.println("Int o/p = " + (a-b-c));
		return a-b-c;
	}
	float sub(float a, float b) {
		System.out.println("Float o/p = " + (a-b));
		return a-b;
	}
	
	int mul(int a, int b) {
		System.out.println("Int o/p = " + (a*b));
		return a*b;
	}
	int mul(int a, int b, int c) {
		System.out.println("Int o/p = " + (a*b*c));
		return a*b*c;
	}
	float mul(float a, float b) {
		System.out.println("Float o/p = " + (a*b));
		return a*b;
	}

}

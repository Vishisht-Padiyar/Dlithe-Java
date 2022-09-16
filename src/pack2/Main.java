package pack2;

public class Main {
	int a;
	float b;
	boolean c;
	double d;
	char e;
	String f;
	void main(int args) {
		Main obj = new Main();
		
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);

	}

	public static void main(String[] args) {
		Main obj = new Main();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj.main(0);
		
	}
	
	

}

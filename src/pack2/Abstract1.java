package pack2;

abstract class Parent1{
	abstract void m1();
	
}
public class Abstract1 extends Parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract1 a = new Abstract1();
		a.m1();
	}
	void m1() {
		System.out.println("m1 output");
		
	}

}


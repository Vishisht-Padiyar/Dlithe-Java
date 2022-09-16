package pack2;

public class MethodOverriding extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding dog = new MethodOverriding();
		dog.animal();
		

	}
	void animal() {
		super.animal();
		System.out.println("This is a dog");
	}

}
class Parent{
	void animal() {
		System.out.println("This is an animal");
	}
}

package pack2;

public class Throe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		if(age < 18) {
			throw new ArithmeticException("Access Denied for age below 18");
		}else {
			System.out.print("Access Granted");
		}

	}

}

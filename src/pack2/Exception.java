package pack2;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		try
		{
			int x = a/b;
			
			System.out.print(x);
		}
		catch(ArithmeticException e){
			System.out.print("Exception occured");
		}

	}

}

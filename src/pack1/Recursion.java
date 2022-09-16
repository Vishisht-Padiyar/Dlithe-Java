package pack1;

public class Recursion {

	public static void main(String[] args) {
		int a = 9;
		Recursion obj = new Recursion();
		System.out.println("Factorial = "+ obj.fact((long)a));

	}
	long fact(long a) {
		if(a == 0l) {
			return 1l;
		}else {
			 
			return (a*fact(a-1));
			
		}
		
	}

}

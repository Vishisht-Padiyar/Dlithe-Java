package pack1;

public class EvenOrOdd {
	public static void main(String[] args) {
		int a = 100,i,flag = 0;
		if(a%2 == 1) {
			System.out.println("Number is odd");
		}else {
			System.out.println("Number is even");
		}
		
		if(a == 1) {
			System.out.println("Number is neither prime nor composite");
		}
		else{
			for(i = 2; i<=a/2;i++) {
				if(a%i == 0 ) {
					flag = 1;
					break;
				}
				
			}
		}
		if(flag == 1 ) {
			System.out.println("Number is not a prime");
		}else {
			System.out.println("Number is prime");
		}
			
		
	}

}

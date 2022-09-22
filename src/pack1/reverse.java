package pack1;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "vishisht", rev = "";
		int i;
		for(i = a.length()-1; i>=0;i--) {
			rev += a.charAt(i);
		}
		System.out.print(rev);

	}

}

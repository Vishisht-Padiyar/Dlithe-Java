package pack2;
import pack1.ProtectedParent;

public class ProtectedChild extends ProtectedParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedChild a = new ProtectedChild();
		a.add(7,100);
		//This is executed only because this inherits the parent from other package
	}

}

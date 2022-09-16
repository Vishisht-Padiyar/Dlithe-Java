package pack1;

public class JavaTraining {
	String empNam;
	int empID;
	int empSalary;
	static String empDesig;

	public static void main(String[] args) {

		JavaTraining a = new JavaTraining("Vishisht", 10, 10000, "Trainee");
		JavaTraining b = new JavaTraining("Ram", 1, 30000, "Accountant");
		a.printDetails();
		b.printDetails();
		

	}
	public JavaTraining(String name, int id, int salary, String desig){
		empNam = name;
		empID = id;
		empSalary=salary;
		empDesig = desig;
		
	}
	void printDetails() {
		System.out.println("Name : " + empNam + "\nID : "+ empID
				+ "\nSalary : "+empSalary + "\nDesignation : "+ empDesig + "\n\n");
	}
	static {
		System.out.println("Welcome to IT field\n");
	}
}


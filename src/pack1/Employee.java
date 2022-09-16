package pack1;

public class Employee {
	String empNam;
	int empID;
	int empSalary;
	String empDesig;
	public  Employee(String name, int id, int salary, String desig){
		this.empNam = name;
		this.empID = id;
		this.empSalary=salary;
		this.empDesig = desig;
		
	}
	void printDetails() {
		System.out.println("Name : " + empNam + "\nID : "+ empID
				+ "\nSalary : "+empSalary + "\nDesignation : "+ empDesig + "\n\n");
	}
}
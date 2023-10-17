package payroll;
import java.util.Scanner;
abstract class Employee extends Person {


	public Employee() {
		super();
	}

	
	public Employee(String firstName, String lastName, String socialSecurityNUmber) {
		super(firstName, lastName, socialSecurityNUmber);
		
	}


	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		
	
	}

	abstract public double calculateSalary();


	@Override
	public String toString() {
		return "HourlyEmployee [ toString()=" + super.toString() + "]";
	}       

	

}



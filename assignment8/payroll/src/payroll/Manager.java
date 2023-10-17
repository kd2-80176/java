package payroll;
import java.util.Scanner;

public class Manager extends Employee {
	
	private double weeklySalary;
	
	

	public Manager() {
		super();
	}

	public Manager(String firstName, String lastName, String socialSecurityNUmber, double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("enter the weekly salary=");
		this.weeklySalary=sc.nextDouble();
		
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + "," + super.toString() +  "]";
	}

	@Override
	public double calculateSalary() {
    return this.weeklySalary;		
	}
	
	
	
	

}

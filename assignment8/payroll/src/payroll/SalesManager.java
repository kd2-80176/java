package payroll;

import java.util.Scanner;

public class SalesManager extends Salesman {
	private double baseSalary;

	public SalesManager() {
		super();
	}

	public SalesManager(String firstName, String lastName, String socialSecurityNUmber, double grossSales,
			double commissionRate, double baseSalary) {

		this.baseSalary = baseSalary;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("enter the basic salary of employee =");
		this.baseSalary = sc.nextDouble();

	}

	@Override
	public String toString() {
		return "BasedSalariedCommisionEmployee [baseSalary=" + baseSalary + "," + super.toString() + "]";
	}

	public double calculateSalary() {
		double TotalSalary = this.getCommissionRate() * this.getGrossSales() + this.baseSalary;
		return TotalSalary;
	}

	public void increament() {
		System.out.println("salary after increment="
				+ ((this.getCommissionRate() * this.getGrossSales()) + this.baseSalary) * 1.1);
	}

}

package payroll;
import java.util.Scanner;
public class Salesman extends Employee {
	private double grossSales;
	private double commissionRate;

	public Salesman() {
		super();

	}

	public Salesman(String firstName, String lastName, String socialSecurityNUmber, double grossSales,
			double commissionRate) {
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("enter the gross sale employee=");
		this.grossSales = sc.nextDouble();
		System.out.print("enter the gross comission rate employee=");
		this.commissionRate = sc.nextDouble();

	}

	@Override
	public String toString() {
		return "CommisionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", "
				+ super.toString() + "]";
	}

	@Override
	public double calculateSalary() {
		double TotalSalary= (this.commissionRate * this.grossSales);
		
		return TotalSalary;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

}

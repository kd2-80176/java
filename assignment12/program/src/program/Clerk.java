package program;

public class Clerk implements Emp {
	private double salary;

	@Override
	public double getSal() {
		
		return this.salary;
	}

	public Clerk(double salary) {
		this.salary = salary;
	}

	
	
	

}

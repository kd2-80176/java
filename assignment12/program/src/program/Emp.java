package program;

public interface Emp {
	public double getSal();

	default double calcIncentives() {
		return 0.0;
	}

	static double calcTotalIncome(Emp arr[]) {
		double totalIncome=0;
		for (Emp emp : arr) {
			
			totalIncome = totalIncome+(emp.getSal() + emp.calcIncentives());

		}
		return totalIncome;
	};

}

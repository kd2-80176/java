package program;

public class Labour implements Emp {
	private double hours;
	private double rate;
	@Override
	public double getSal() {
		
		return this.hours*this.rate;
	}
	@Override
	public double calcIncentives() {
	     if(this.hours>300)
	    	 return this.hours*rate*0.05;
	     else 
	    	 return 0.0;
	}
	public Labour(double hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}
	
	
	
	

}

package program01;



public class ExceptionLineTooLong extends Exception{
	private String s;
	
	public ExceptionLineTooLong(String s) 
	{
		this.s=s;
		
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [s=" + s + "]";
	}
	
	
	
	
	  

}

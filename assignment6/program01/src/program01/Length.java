package program01;

public class Length {
	private String s;
	
	
	

	public void setS(String s) throws ExceptionLineTooLong {
		if(s.length()>80)
		throw new ExceptionLineTooLong("string length is too long");
	 else
		this.s = s;
	}




	@Override
	public String toString() {
		return "String [s=" + s + "]";
	}

}

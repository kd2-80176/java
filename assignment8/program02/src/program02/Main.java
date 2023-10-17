package program02;

class Box<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Box [data=" + data + "]";
	}

}

public class Main {
	public static void printDisplayBox(Box<? extends Displayable>b) 
	{
		b.getData().display();
	}
	public static void printBox(Box<?>b) {
		System.out.println(b.getData().toString());
		
	}
	public Main() {
		Box<Person> b1=new Box<>();
		Person p1=new Person();
		p1.accept();
		b1.setData(p1);
		printDisplayBox(b1);
		
		Box<Date> b2=new Box<>();
		Date d1=new Date();
		p1.accept();
		b2.setData(d1);
		printDisplayBox(b2);
		
		Box<String> s2=new Box<>();
		s2.setData("hello");
		printDisplayBox(b2);
		
		printBox(b1);
		printBox(b2);
		printBox(s2);
		
		
		
		
		
		
		
		
		
		

	}

}

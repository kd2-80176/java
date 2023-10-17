package payroll;

import java.util.Scanner;

class Box<T extends Employee> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public double getTotalSalary() {
		return data.calculateSalary();
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//     Manager m=new Manager();
//     m.accept(sc);
//     m.toString();
//     Box<Manager> b1=new Box<>();
//     b1.setData(m);
//    
		// System.out.println("Total salary="+ b1.getTotalSalary());
//     
//     Salesman s=new Salesman();
//     s.accept(sc);
//     s.toString();
//     Box<Salesman> b2=new Box<Salesman>();
//     b2.setData(s);
//      System.out.println("Total salary="+ b2.getTotalSalary());
//     
//     
//		  SalesManager sm=new SalesManager();
//		  sm.accept(sc);
//		  sm.toString();
//		  Box<SalesManager> b3=new Box<>();
//		  b3.setData(sm);
//		  System.out.println("Total salarry="+b3.getTotalSalary());

		Manager m = new Manager();
		m.accept(sc);
		m.toString();
		Employee e;
		Box<Employee> b4 = new Box<>();
		b4.setData(m);//here we done upcasting
		System.out.println("Total salarry=" + b4.getTotalSalary());
	}

}

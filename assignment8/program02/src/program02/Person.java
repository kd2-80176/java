package program02;

import java.util.Scanner;

public class Person implements Displayable{
	private String fname;
	private String lname;
	private int age;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.print("enter the first name of person=");
		fname = sc.next();
		System.out.print("enter the last name of emoloyee");
		lname = sc.next();
		System.out.print("enter the age of person");
		age=sc.nextInt();
	}	 
	@Override
	public void display() 
	{
		System.out.println("first name ="+fname);
		System.out.println("first name ="+lname);
		System.out.println("first name ="+age);
		
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}


	
}

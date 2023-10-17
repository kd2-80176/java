package program02;

import java.util.Scanner;

public class Date  implements Displayable {
	Scanner sc = new Scanner(System.in);
	private int day;
	private int month;
	private int year;

	public void accept() {
		System.out.print("enter the day=");
		day = sc.nextInt();
		System.out.print("enter the month=");
		month = sc.nextInt();
		System.out.print("enter the year=");
		year = sc.nextInt();

	}

	@Override
	public void display() {
		System.out.println("DATE="+day+"/"+month+"/"+year);

	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}

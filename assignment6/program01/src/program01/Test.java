package program01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String s;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("enter the string=");
			s = sc.next();
			Length l = new Length();
			l.setS(s);
		System.out.println(l.toString());

		} catch (ExceptionLineTooLong e) {
			System.out.println(e.toString());
		}
   System.out.println("program executed succefully");
	}

}

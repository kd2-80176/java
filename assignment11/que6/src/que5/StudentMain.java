package que5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//we don't need to write the equals and Hash code
public class StudentMain {

	public static int menu() {
		int choice;
		System.out.println("******************************");
		System.out.println("0.EXIT");
		System.out.println("1.insert into map");
		System.out.println("2.find in map");
		System.out.print("enter the choice=");
		choice = new Scanner(System.in).nextInt();
		System.out.println("*****************************");
		return choice;
	}

	public static void main(String[] args) {
		Map<Integer, Student> map = new LinkedHashMap<Integer, Student>();
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Student s = new Student();
				s.acceptdata();
				map.put(s.getRoll(), s);
				System.out.println("--------------STUDENT ADDED IN MAP-----------------");
				System.out.println(map);

				break;
			case 2:
                   System.out.print("Enter the roll no of studentt you want to find=");
                   int roll=new Scanner(System.in).nextInt();
                      Student s1=map.get(roll);
                      System.out.println(s1);
				break;

			default:

				break;
			}

		}
	}
}

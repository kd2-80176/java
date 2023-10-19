package que5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tester {

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
		int choice;
		Map<String, Library> map=new HashMap<String, Library>();
	
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Library lib=new Library();
				lib.acceptData();
				map.put(lib.getIsbn(), lib);

				break;
			case 2:
				System.out.print("enter the isbn you want to find=");
				String isbn=new Scanner(System.in).next();
				Library lib2=map.get(isbn);
				System.out.println(lib2);
				System.out.println("invalid choice");
				break;

			default:
				
				break;
			}

		}

	}

}

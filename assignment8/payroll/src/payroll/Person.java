package payroll;
import java.util.Scanner;
abstract public class Person {
	
		private String firstName;
		private String lastName;
		private String socialSecurityNUmber;

		public Person() {

		}

		public Person(String firstName, String lastName, String socialSecurityNUmber) {

			this.firstName = firstName;
			this.lastName = lastName;
			this.socialSecurityNUmber = socialSecurityNUmber;
		}

		public void accept(Scanner sc) {

			System.out.print("enter the first name of employee=");
			firstName = sc.next();
			System.out.print("enter the last name of employee=");
			lastName = sc.next();
			System.out.print("enter the first social security number of employee=");
			socialSecurityNUmber = sc.next();

		}

		@Override
		public String toString() {
			return "[firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNUmber="
					+ socialSecurityNUmber +  "]";
		}

	

	}




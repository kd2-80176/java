package program02;

import java.util.Scanner;

public class Que2 {
	public static int menu() {
		int choice;
		System.out.println("***************************************");
		System.out.println("0.Exit");
		System.out.println("1.Pefrom addition");
		System.out.println("2.Perform substraction");
		System.out.println("3.Perform multiplication");
		System.out.println("4.Perform division");
		System.out.print("enyer your choice=");
		choice = new Scanner(System.in).nextInt();
		System.out.println("***************************************");
		return choice;

	}
   static void  calculate(double num1,double num2,Arithmatic op) 
   {
	   double result=op.calc(num1,num2);
	   System.out.println("Result :"+result);
   }
	public static void main(String[] args) {
		
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
                  System.out.print("Enter the number 1=");
                  double num1=new Scanner(System.in).nextDouble();
                  System.out.print("enter the number 2=");
                  double num2=new Scanner(System.in).nextDouble();
                  calculate(num1, num2, (x,y)->x+y);
                  
				break;
			case 2:
				 System.out.print("Enter the number 1=");
                 double num3=new Scanner(System.in).nextDouble();
                 System.out.print("enter the number 2=");
                 double num4=new Scanner(System.in).nextDouble();
                 calculate(num3, num4, (x,y)->x-y);
				break;
			case 3:
				 System.out.print("Enter the number 1=");
                 double num5=new Scanner(System.in).nextDouble();
                 System.out.print("enter the number 2=");
                 double num6=new Scanner(System.in).nextDouble();
                 calculate(num5, num6, (x,y)->x*y);
				break;
			case 4:
				 System.out.print("Enter the number 1=");
                 double num7=new Scanner(System.in).nextDouble();
                 System.out.print("enter the number 2=");
                 double num8=new Scanner(System.in).nextDouble();
                 calculate(num7, num8, (x,y)->x/y);
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}

}

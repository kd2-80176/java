
package com.app.geomerty;
import java.util.Scanner;


public class Test {
	
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x;
		double y;
		String s;
		   
		System.out.println("enter the details of first coordinate");
		System.out.println("ENTER THE X COORDINATE=");
		x=sc.nextInt();
		System.out.println("ENTER THE Y COORDINATE=");
		y=sc.nextInt();
		Point2D p1=new Point2D(x,y);
		System.out.println("enter the details of first coordinate");

		System.out.println("ENTER THE X COORDINATE=");
		x=sc.nextInt();
		System.out.println("ENTER THE Y COORDINATE=");
		y=sc.nextInt();
		Point2D p2=new Point2D(x,y);
		p1.getDetails();
		p2.getDetails();
		
		if(p1.isEqual(p2))
			System.out.println("both coordinate are same ");
		else
			System.out.println("both coodinate are different");
		
		double d=p1.calculateDistance(p2);
		System.out.println("distance between coordinate="+d);
	

	}

}
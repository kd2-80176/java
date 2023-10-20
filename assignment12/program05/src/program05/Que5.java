package program05;

import java.util.Scanner;
import java.util.stream.Stream;

public class Que5 {

	public static void main(String[] args) {
	System.out.print("Enter the number to calculate the factcorial=");
	int num=new Scanner(System.in).nextInt();
	Stream<Integer> str=Stream.iterate(1, x->x+1).limit(num);
	int fact=str.reduce(1, (x,y)->x*y);
	System.out.println("factorial="+fact);
	
	
	
	}

}

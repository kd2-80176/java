package program06;

import java.util.Random;
import java.util.stream.Stream;

public class CalSum {
	public static void main(String[] args) {
		Random r=new Random();
		Stream<Integer> str=Stream.generate(()->r.nextInt(100)).limit(10);
		int sum=str.reduce(0,(x,y)->x+y);
		System.out.println("addition="+sum);
		
		
	}

}

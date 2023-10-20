package program01;

import java.util.function.Predicate;

public class Que1 {
	public static int countIf(String[] arr, Predicate<String> cond)
	{
	 int count=0;
	 for (String str : arr) {
		 if(cond.test(str))
			 count++;
		
	}
	 return count;
	}

	public static void main(String[] args) {
		String[] arr= {"Nilesh","Shubham","Pratik","Omkar","Prashant"};
//		
//		int cnt=countIf(arr, new Predicate<String>() {
//		  public boolean test(String s) {
//			  return s.length()>6;
//		  }
//		});
//		System.out.println("Result :"+cnt);
//		
//	}
	int cnt=countIf(arr,s->s.length()>6);
		
		System.out.println("Result :"+cnt);
		
	}

}

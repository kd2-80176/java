package program04;

public class Que4 {
	static<T> int countIf(T[] arr,T key,Check<T> c) 
	{
	  	int count=0;
	  	for (T ele: arr) {
	  		if(c.compare(ele, key)) 
	  			count++;
	  	}
			
		return count;
	}

	public static void main(String[] args) {
		Double [] arr= {44.1,77.6,99.3,22.6,77.6,55.44,66.5,44.1,77.6,44.3,55.6};
		Double  key=77.6;
		
		int cnt=countIf(arr, key,(x,y)->x.equals(y));
		System.out.println("Result :"+cnt);
	}

}

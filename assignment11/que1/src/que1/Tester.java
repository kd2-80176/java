package que1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
	Set<Library> book= new HashSet<>();
	
		
		book.add(new Library("101",125.0,"shekhar",10));
		book.add(new Library("34",150.0,"yashraj",20));
		book.add(new Library("19",200.0,"tanay",60));
		book.add(new Library("105",225.0,"pranav",70));
		book.add(new Library("1040",110.0,"dhnaraj",20));
		book.add(new Library("105",500.0,"krushna",30));
		book.add(new Library("107",450.0,"sahil",50));
		
		 Iterator<Library> itr=book.iterator();
		 
		 while(itr.hasNext()) 
		 {
		    Library ele=itr.next();
		    System.out.println(ele);
		    
		 }
		 
	//without hash code 	
//if hash code is not included then output is not in sorted out (non-ordered)
//it takes an duplictes
	//with hashcode
//if hash code and equals   no duplicates allowed		 
		 
	}

}

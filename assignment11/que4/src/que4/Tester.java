package que4;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		

		
		class priceComparator implements Comparator<Library> {
			public int compare(Library l1, Library l2) {
				int diff = -Double.compare(l1.getPrice(), l2.getPrice());
				return diff;

			}
		}

		priceComparator com = new priceComparator();
//		Set<Library> book = new TreeSet<Library>(com);
		TreeSet<Library> book = new TreeSet<Library>(com);

		book.add(new Library("101", 125.0, "shekhar", 10));
		book.add(new Library("107", 150.0, "yashraj", 20));
		book.add(new Library("10", 200.0, "tanay", 60));
		book.add(new Library("37", 225.0, "pranav", 70));
		book.add(new Library("101", 125.0, "dhnaraj", 20));
		book.add(new Library("1050", 500.0, "krushna", 30));
		book.add(new Library("107", 450.0, "sahil", 50));
		
//   iterator in forward travarsal	
		System.out.println("Iterate in forward order: ");
    	Iterator<Library> itr = book.iterator();

		while (itr.hasNext()) {
			Library ele = itr.next();
			System.out.println(ele);
		}
		//descendingIterator only used with the TreeSet<>
		System.out.println("Iterate in Descending order: ");
		Iterator<Library> itr2=book.descendingIterator();
				while(itr2.hasNext())
				{
				  Library ele2=itr2.next();	
				   System.out.println(ele2);
				}

		
       
	}

}
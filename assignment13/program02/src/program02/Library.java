package program02;



import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Library implements Serializable {
	
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	Scanner sc = new Scanner(System.in);

	public Library() {

	}

	public Library(String isbn, double price, String authorName, int quality) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quality;
	}

	public void acceptData() {
		System.out.print("enter the isbn =");
		isbn = sc.next();
		System.out.print("enter the price of book=");
		price = sc.nextDouble();
		System.out.print("enter the author name of book=");
		authorName = sc.next();
		System.out.print("enter the quantity=");
		quantity = sc.nextInt();

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quality) {
		this.quantity = quality;
	}

	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		Library other=(Library) obj;
	   	if(this.isbn.equals(other.isbn)) 
	   		return true;
	   	else 
	   		return false;
	}


}


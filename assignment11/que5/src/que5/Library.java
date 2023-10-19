package que5;

import java.util.Objects;
import java.util.Scanner;

public class Library implements Comparable<Library> {

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
		this.quantity = quantity;
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
	public int compareTo(Library lib) {
		int diff = this.getIsbn().compareTo(lib.getIsbn());
		return diff;
	}
//
//	@Override
//	public int hashCode() {
//		int hash=Objects.hash(this.isbn);
//		return hash;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Library other = (Library) obj;
//		return Objects.equals(isbn, other.isbn);
//	}
}

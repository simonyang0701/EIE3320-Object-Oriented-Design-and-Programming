package bookstore;
import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Book> {
	private static final long serialVersionUID = 1L;
	public ShoppingCart() {
	}
	
	public void addBook(Book book) {
		this.add(book);
	}
	
	public Book getBook(int i) {
		return this.get(i);
	}
	
	public double getTotalPrice() {
		double price = 0.0;
		for (Book book : this) {
			price += book.getPrice();
		}
		return price;
	}
}

package bookstore;

import java.io.Serializable;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	private String isbn;
	private String author;
	private String title;
	private double price;
	private int edition;
	private String publisher;
	private String copyright;
	public Book(String isbn, String author, String title, double price, int edition, String publisher, String copyright) {
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.price = price;
		this.edition = edition;
		this.publisher = publisher;
		this.copyright = copyright;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getAuthor() {
		return author;
	}
	public int getEdition() {
		return edition;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getCopyright() {
		return copyright;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

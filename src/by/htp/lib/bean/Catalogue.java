package by.htp.lib.bean;

import java.util.Arrays;
import java.util.Date;

public class Catalogue {

	
	private Book[] books;
	private String title;
	private Date createDate;
	
	public Catalogue() {
		super();
	}
	
	@Override
	public String toString() {
		return "Catalogue [books=" + Arrays.toString(books) + ", title=" + title + ", createDate=" + createDate + "]";
	}

	public Book[] getBooks() {
		return books;
	}
	public String getTitle() {
		return title;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
